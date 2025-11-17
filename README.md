# 📱 Magic Answer – App de Respostas Aleatórias

Aplicativo Android simples e divertido desenvolvido em **Kotlin**, onde o usuário digita um nome e recebe uma resposta aleatória entre **“Sim”, “Não” ou “Talvez”**.
Ideal como introdução ao uso de interface, eventos de clique e geração de valores aleatórios no Android.

---

## 🚀 Funcionalidades

✔ Campo de entrada para digitar um nome
✔ Botão para gerar resposta
✔ Exibição dinâmica e personalizada da resposta
✔ Validação para evitar campo vazio
✔ Lista de respostas escolhidas aleatoriamente (`Sim`, `Não`, `Talvez`)

---

## 🧠 Como o App Funciona

O usuário digita um nome → aperta o botão → o app seleciona uma resposta aleatória da lista:

```kotlin
private val respostas = listOf("Sim", "Não", "Talvez")
val resposta = respostas.random()
```

E exibe na tela:

```
Thais, sua resposta é: Sim
```

---

## 📂 Estrutura Simplificada

```
app/
 ├── MainActivity.kt
 ├── res/
 │    ├── layout/activity_main.xml
 │    ├── values/strings.xml
 │    └── drawable/
 └── AndroidManifest.xml
```

---

## 🛠 Tecnologias Utilizadas

* Kotlin
* Android SDK
* ViewBinding (opcional)
* Randomização com Kotlin
* Manipulação de eventos (setOnClickListener)

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/Belganciaga/trabalho-1-bimestre.git
```

2. Abra no **Android Studio**
3. Conecte um dispositivo ou use um emulador
4. Execute o aplicativo (Run ▶)

---

## 🧪 Possíveis Melhorias Futuras

Essas ideias deixam o projeto mais completo para portfólio:

* Adicionar mais respostas
* Inserir animações ao mostrar a resposta
* Criar design moderno com Material 3
* Adicionar cores dinâmicas baseadas na resposta
* Criar tema dark e light
* Transformar em um app estilo *Magic 8 Ball*

---

## 🙋 Autora

**Thais Rodrigues (Belganciaga)**

🔗 LinkedIn: [https://www.linkedin.com/in/thayrodrigues0308/](https://www.linkedin.com/in/thayrodrigues0308/)

🐙 GitHub: [https://github.com/Belganciaga](https://github.com/Belganciaga)

