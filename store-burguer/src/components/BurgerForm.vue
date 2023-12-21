<template>

  <div>
    <Message :msg="msg" v-show="msg" />
    <div>

      <form id="burger-form" method="POST" @submit="createBurger">
        <div class="input-container">
          <label for="nome">{{ $t("burgerForm.text0001")}}:</label>
          <input type="text" id="nome" name="nome" v-model="nome" 
          :placeholder="$t('burgerForm.text0013')">
        </div>
        <div class="input-container">
          <label for="pao">{{ $t("burgerForm.text0002")}}:</label>
          <select name="pao" id="pao" v-model="pao">
            <option value=""> {{ $t("burgerForm.text0011")}} </option>
            <option v-for="pao in db.ingredientes.paes" :key="pao.id" :value="pao.tipo">{{ pao.tipo }}</option>
          </select>
        </div>
        <div class="input-container">
          <label for="carne">{{ $t("burgerForm.text0003")}}:</label>
          <select name="carne" id="carne" v-model="carne">
            <option value=""> {{ $t("burgerForm.text0012") }} </option>
            <option v-for="carne in db.ingredientes.carnes" :key="carne.id" :value="carne.tipo">{{ carne.tipo }}</option>
          </select>
        </div>
        <div id="opcionais-container" class="input-container">
          <label id="opcionais-title" for="opcionais">{{ $t("burgerForm.text0004")}}:</label>

          <div class="checkbox-container" v-for="opcional in db.ingredientes.opcionais" :key="opcional.id">

            <input type="checkbox" name="opcionais" v-model="opcionais" :value="opcional.tipo">

            <span class="opcional-color" if="opcional.tipo == ''">
              {{ opcional.tipo }} 
            </span>

          </div>

        </div>

        <div class="input-container">
          <input class="submit-btn" type="submit" :value="$t('burgerForm.text0020')">
        </div>

      </form>

    </div>
  </div>

</template>

<script>
import Message from './Message'
import db from "../../db/db.json"

export default {
  name: "BurgerForm-view",
  data() {
    return {
      paes: null,
      carnes: null,
      opcionaisdata: null,
      nome: null,
      pao: null,
      carne: null,
      opcionais: [],
      status: "Solicitado",
      msg: null,
      db: db,
      
    }
  },
  methods: {

    // async getIngredientes() {
    //   const req = await fetch('../../db/db.json/ingredientes')
    //   console.log("req => ", req)

    //   const data = await req.json()
    //   console.log("data => ", data)

    //   this.paes = data.paes
    //   this.carnes = data.carnes
    //   this.opcionaisdata = data.opcionais
    // },


    async createBurger(e) {

      e.preventDefault()

      // const data = {
      //   nome: this.nome,
      //   carne: this.carne,
      //   pao: this.pao,
      //   opcionais: Array.from(this.opcionais),
      //   status: "Solicitado"
      // }

      // const dataJson = JSON.stringify(data)    

      // const req = await fetch("../../db/db.json/burgers", {
      //   method: "POST",
      //   headers: { "Content-Type" : "application/json" },
      //   body: dataJson
      // });

      // const res = await req.json()

      // console.log(res)

      this.msg = "Pedido realizado com sucesso!"

      // clear message
      setTimeout(() => this.msg = "", 3000)

      // limpar campos
      this.nome = ""
      this.carne = ""
      this.pao = ""
      this.opcionais = []
      
    }
  },
  mounted () {
    // this.getIngredientes()
  },
  components: {
    Message
  }
}
</script>

<style scoped>




  #burger-form {
    max-width: 400px;
    margin: 0 auto;
  }

  .input-container {
    display: flex;
    flex-direction: column;
    margin-bottom: 20px;
  }

  label {
    font-weight: bold;
    margin-bottom: 15px;
    color: #fff;
    padding: 5px 10px;
    border-left: 4px solid #d5c06b;
  }

  input, select {
    padding: 5px 10px;
    width: 300px;
  }

  #opcionais-container {
    flex-direction: row;
    flex-wrap: wrap;
  }

  #opcionais-title {
    width: 100%;
  }

  .opcional-color {
    color: #fff;
  }

  .checkbox-container {
    display: flex;
    align-items: flex-start;
    width: 50%;
    margin-bottom: 20px;
  }

  .checkbox-container span,
  .checkbox-container input {
    width: auto;
  }

  .checkbox-container span {
    margin-left: 6px;
    font-weight: bold;
  }

  .submit-btn {
    background-color: #222;
    color:#d5c06b;
    font-weight: bold;
    border: 2px solid #222;
    padding: 10px;
    font-size: 16px;
    margin: 0 auto;
    cursor: pointer;
    transition: .5s;
  }

  .submit-btn:hover {
    background-color: transparent;
    color: #222;
  }
</style>