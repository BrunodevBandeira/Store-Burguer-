<template>

  <div class="container">

    <div class="main-BannerInfo"></div>
    
    <div class="main-container">
      <h1> 
        {{  $t("bannerInfo.text0001") }}
      </h1> 
    </div>

  </div>
  <span class="line"></span>

</template>

<script>
  export default {
    name: "BannerInfo-view"
  }
</script>

<style scoped>

  .container {
    display: flex;
    background:   #333333 ;

    height: 100vh;
  }

  .line {
    content: "";
    display: block;
    height: 2px;
    background-color: #d5c06b; /* Cor da linha amarela */
  }
  

  .main-BannerInfo {
    /* background-image: url('../../public/img/burger03.jpg') ; */
    background-image: linear-gradient(to right, #00000000, #0000002f, rgb(0, 0, 0)), url('../../public/img/burger03.jpg');
     /* background-position: 0 -250px; */
     /* background-position: 0 50px; */
    background-size: cover;
    height: 37.4rem;
    width: 39rem;
    /* display: flex;
    align-items: center;
    justify-content: flex-start; */
  }

  .main-container {
    background: linear-gradient(to right,  #000000, #07000070, #333333);
    width: 100vw;
    position: relative;
    right: 32px;
  }

   .main-container h1 {
    margin-top: 8rem;
    margin-right: 3rem;
    color: #d5c06b;
  }
/* 
  background: linear-gradient(to right, #111 30%, transparent 70%);
  background: linear-gradient(to top, #111 10%, transparent 90%);  */

</style>