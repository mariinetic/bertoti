document.addEventListener('DOMContentLoaded', () => {
  const path = window.location.pathname;

  if (path.includes('index.html')) {
    fetchBolsas();
  }

  if (path.includes('edit.html')) {
    const params = new URLSearchParams(window.location.search);
    const id = params.get('id');
    if (id) fetchBolsa(id);
  }

  if (path.includes('create.html')) {
    document.getElementById('bolsa-form').addEventListener('submit', function (e) {
      e.preventDefault();
      createBolsa();
    });
  }

  if (path.includes('edit.html')) {
    document.getElementById('edit-bolsa-form').addEventListener('submit', function (e) {
      e.preventDefault();
      updateBolsa();
    });
  }
});

const API_URL = 'http://localhost:8080/bolsas';

function fetchBolsas() {
  fetch(API_URL)
    .then(response => {
      if (!response.ok) throw new Error('Erro ao buscar bolsas');
      return response.json();
    })
    .then(bolsas => {
      const container = document.querySelector('.bags-container');
      container.innerHTML = '';
      bolsas.forEach(bolsa => {
        const div = document.createElement('div');
        div.classList.add('bag-card');
        div.innerHTML = `
          <h3>${bolsa.nome}</h3>
          <img src="${bolsa.imagemUrl}" alt="${bolsa.nome}" class="bag-image"/>
          <p>ID: ${bolsa.id}</p>
          <p>Preço: R$ ${bolsa.preco}</p>
          <button onclick="editBolsa('${bolsa.id}')">Editar</button>
          <button onclick="deleteBolsa('${bolsa.id}')">Excluir</button>
        `;
        container.appendChild(div);
      });
    })
    .catch(error => console.error(error));
}

function editBolsa(id) {
  window.location.href = `edit.html?id=${id}`;
}

function fetchBolsa(id) {
  fetch(`${API_URL}/${id}`)
    .then(response => {
      if (!response.ok) throw new Error('Erro ao buscar bolsa');
      return response.json();
    })
    .then(bolsa => {
      document.getElementById('edit-bolsa-name').value = bolsa.nome;
      document.getElementById('edit-bolsa-price').value = bolsa.preco;
      document.getElementById('edit-bolsa-image').value = bolsa.imagemUrl;
      document.getElementById('edit-bolsa-index').value = bolsa.id;
    })
    .catch(error => console.error(error));
}

function createBolsa() {
  const nome = document.getElementById('bolsa-name').value;
  const precoInput = document.getElementById('bolsa-price').value;
  const imagemUrl = document.getElementById('bolsa-image').value;

  if (!nome || !precoInput || !imagemUrl) {
    alert('Por favor, preencha todos os campos.');
    return;
  }

  const preco = parseFloat(precoInput);

  if (isNaN(preco)) {
    alert('Preço inválido. Digite um número.');
    return;
  }

  const bolsa = { nome, preco, imagemUrl };
  console.log('Enviando:', bolsa);

  fetch(API_URL, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(bolsa)
  })
    .then(response => {
      if (!response.ok) throw new Error('Erro ao criar bolsa');
      return response.json();
    })
    .then(() => {
      alert('Bolsa criada com sucesso!');
      window.location.href = 'index.html';
    })
    .catch(error => {
      console.error(error);
      alert('Erro ao criar bolsa. Veja o console para mais detalhes.');
    });
}

function updateBolsa() {
  const id = document.getElementById('edit-bolsa-index').value;
  const nome = document.getElementById('edit-bolsa-name').value;
  const precoInput = document.getElementById('edit-bolsa-price').value;
  const imagemUrl = document.getElementById('edit-bolsa-image').value;

  const preco = parseFloat(precoInput);

  if (!nome || !preco || !imagemUrl || isNaN(preco)) {
    alert('Por favor, preencha todos os campos corretamente.');
    return;
  }

  const bolsa = { nome, preco, imagemUrl };
  console.log('Atualizando:', bolsa);

  fetch(`${API_URL}/${id}`, {
    method: 'PUT',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(bolsa)
  })
    .then(response => {
      if (!response.ok) throw new Error('Erro ao editar bolsa');
      return response.json();
    })
    .then(() => {
      alert('Bolsa editada com sucesso!');
      window.location.href = 'index.html';
    })
    .catch(error => {
      console.error(error);
      alert('Erro ao editar bolsa. Veja o console para mais detalhes.');
    });
}

function deleteBolsa(id) {
  if (!confirm('Tem certeza que deseja excluir esta bolsa?')) return;

  fetch(`${API_URL}/${id}`, { method: 'DELETE' })
    .then(response => {
      if (!response.ok) throw new Error('Erro ao deletar bolsa');
    })
    .then(() => {
      alert('Bolsa deletada com sucesso!');
      fetchBolsas();
    })
    .catch(error => {
      console.error(error);
      alert('Erro ao excluir bolsa. Veja o console para mais detalhes.');
    });
}
