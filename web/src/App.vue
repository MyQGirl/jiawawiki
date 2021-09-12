<template>
  <a-layout>
    <the-header></the-header>
    <router-view/>
    <a-layout-footer style="text-align: center">
    甲蛙电子书
    </a-layout-footer>
  </a-layout>
</template>

<script lang="ts">
  import { defineComponent } from 'vue';
  import TheHeader from '@/components/the-header.vue'; // @ is an alias to /src

  export default defineComponent({
    name: 'app',
    components: {
      TheHeader,
    },
  });
</script>

<style>
  #components-layout-demo-top-side-2 .logo {
    float: left;
    width: 120px;
    height: 31px;
    margin: 16px 24px 16px 0;
    background: rgba(255, 255, 255, 0.3);
  }

  .ant-row-rtl #components-layout-demo-top-side-2 .logo {
    float: right;
    margin: 16px 0 16px 24px;
  }

  .site-layout-background {
    background: #fff;
  }
</style>
