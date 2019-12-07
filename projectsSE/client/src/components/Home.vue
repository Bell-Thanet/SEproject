<template>
    <v-row justify="center">
        <v-col cols="4" >
            <v-row justify="center">
                <v-col cols="10">
                    <v-text-field
                        outlined
                        label="ID ผู้ใช้งาน"
                        v-model="user.genderId"
                        :rules="[(v) => !!v || 'Item is required']"
                        required
                    ></v-text-field>
                    <p v-if="CheckID != ''">ชื่อผู้ใช้ : {{name}}</p>
                </v-col>
                <v-col cols="2">
                    <div class="my-2">
                        <v-btn @click="Showlist" depressed large color="primary">Search</v-btn>
                    </div>
                </v-col>
            </v-row>
<div v-if="CheckID">
            <v-row justify="center">
            <v-col cols="10">
              <v-text-field
                solo
                label="Email"
                v-model= "email"
                :rules="emailRules"
                required
                clearable
                prepend-icon="mdi-email"
              ></v-text-field>
            </v-col>
          </v-row>
</div>


        </v-col>
    </v-row>
    
</template>

<script>
import http from "../http-common";
export default {
    data(){
        return{
            user: {
            genderId: null
            },
            name:"",
            email:""

        };
    },

    methods: {
        Showlist(){
            http
        .get("/gender/" + this.user.genderId)
        .then(response => {
          console.log(response);
          if (response.data != null) {
            this.name = response.data.sex;
            this.CheckID = response.status;
          } else {
            this.clear()
          }          
        })
        .catch(e => {
          console.log(e);
        });
      this.submitted = true;
        },
        mounted() {
      this.getGenders();
      this.getNameTypes();
      this.getPhoneTypes();
  }
    },
      
}
</script>
