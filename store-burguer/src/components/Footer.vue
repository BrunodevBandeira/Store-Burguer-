<template>
  <div id="footer">
    <p> {{ $t('footer.text0002') }} </p>
    <p> {{ $t('footer.text0001') }} </p>
    <p> {{ $t('footer.text0003') }} </p>
  </div>
</template>

<script>
export default {
  name: "Footer-View"
}
</script>

<style scoped>
  #footer {
    height: 200px;
    /* background-color: #222; */
    background: linear-gradient(to bottom, #333333,#000000);

    border-top: 4px solid #111;
    color: #d5c06b;
    display: flex;
    align-items: center;
    flex-direction: column;
    justify-content: center;
    bottom: 0;
    width: 100%;
  }
</style>