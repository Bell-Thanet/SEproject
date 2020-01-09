<template>
 <v-col class="text-center" cols="12" sm="4">
      <div class="my-2">
        <v-btn small @click="Members">Members</v-btn>
      </div>
      <div class="my-2">
        <v-btn small @click="Reservation">Reservation</v-btn>
      </div>
      <div class="my-2">
        <v-btn small @click="Borrow">Borrow</v-btn>
      </div>
      <div class="my-2">
        <v-btn small @click="Returns">Returns</v-btn>
      </div>
 </v-col>
 
</template>

<script>
import http from "../http-common";
export default {
  data() {
    return {

    };
  },

  methods: {
      Members() {
      this.$router.push("/members");
    },
    Reservation(){
        this.$router.push("/Reservation")
    },
    Borrow(){
        this.$router.push("/Borrow")
    },
    Returns(){
        this.$router.push("/Returns")
    }
   

    
  },mounted() {
     
    }
};
</script>
