
<template>
  <v-row justify="center">
    <v-col cols="4">
      <v-row justify="center">
        <v-col cols="10">
          <v-text-field
            outlined
            label="ID ผู้ใช้งาน"
            v-model="returns.return_id"
            :rules="[(v) => !!v || 'Item is required']"
            required
          ></v-text-field>
          <p v-if="CheckID != ''">ชื่อผู้ใช้ : {{name}}</p>
        </v-col>

        <v-col cols="2">
          <div class="my-2">
            <v-btn @click="ShowReturn_id" depressed large color="primary">Search</v-btn>
          </div>
        </v-col>
      </v-row>

      <div v-if="CheckID">
        <v-row justify="center">
          <v-col cols="10">
            <v-select
              label="พนักงานรับคืน"
              solo
              v-model="returns.employee_Id"
              :items="employees"
              item-text="name"
              item-value="id"
              :rules="[(v) => !!v || 'Item is required']"
              required
              prepend-icon="mdi-account"
            ></v-select>
          </v-col>
        </v-row>

        <!-- <v-row justify="center">
          <v-col cols="10">
            <v-select
              label="อุปกรณ์ที่จะคืน"
              solo
              v-model="a"
              :items="nametypes"
              item-text="nametype"
              item-value="id"
              :rules="[(v) => !!v || 'Item is required']"
              required
              prepend-icon="mdi-account"
            ></v-select>
          </v-col>
        </v-row> -->

        <v-row justify="center">
          <v-col cols="10">
            <v-select
              label="สภาพอุปกรณ์ที่คืน"
              solo
              v-model="returns.statusId"
              :items="statuss"
              item-text="statuss"
              item-value="id"
              :rules="[(v) => !!v || 'Item is required']"
              required
              prepend-icon="mdi-account"
            ></v-select>
          </v-col>
        </v-row>


<v-row justify="center">
          <v-col cols="10">
            <v-select
              label="สภาพอุปกรณ์ที่คืน"
              solo
              v-model="returns.returns"
              :items="returns"
              item-text="employee.name"
              item-value="id"
              :rules="[(v) => !!v || 'Item is required']"
              required
              prepend-icon="mdi-account"
            ></v-select>
          </v-col>
        </v-row>

        <v-row justify="center">
          <v-col cols="10">
            <v-select
              label="สภาพอุปกรณ์ที่คืน"
              solo
              v-model="returns.statusId"
              :items="returns"
              item-text="b"
              item-value="id"
              :rules="[(v) => !!v || 'Item is required']"
              required
              prepend-icon="mdi-account"
            ></v-select>
          </v-col>
        </v-row>





      </div>
    </v-col>
  </v-row>
</template>

<script>
import http from "../http-common";
export default {
  data() {
    return {
      returns: {
        genderId: null,
        statusId: null,
        employee_Id: null,
        returns:null
      },
      name: "",
      employees: null,
      statuss: null,
      CheckID:false
      
    };
  },

  methods: {
    ShowReturn_id() {
      http
        // .get("/check/" + this.returns.return_id)
        .get("/Members/" + this.returns.return_id)
        .then(response => {
          console.log(response);
          if (response.data != null) {
            this.name = response.data.name;
            this.CheckID = response.status;
            alert("มี");
          } else {
            this.returns.genderId = "";
            alert("ไม่มี");
          }
        })
        .catch(e => {
          console.log(e);
        });
    },
    getStatuss() {
      http
        .get("/status")
        .then(response => {
          this.statuss = response.data;
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
    getEmployees() {
      http
        .get("/employee")
        .then(response => {
          this.employees = response.data;
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },
    getReturns() {
      http
        .get("/return")
        .then(response => {
          this.returns = response.data;
          console.log(response.data);
        })
        .catch(e => {
          console.log(e);
        });
    },

    
  },mounted() {
      this.getStatuss();
      this.getEmployees();
      this.getReturns();
    }
};
</script>
