package com.example.assiment2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/api/v2")
public class controller0 {
    ArrayList<Customers> cust = new ArrayList();

    @GetMapping("/cust")

    public ArrayList<Customers> getCust() {
        return cust;
    }


    @PostMapping("/add")
    public ApiResponse1 addCust(@RequestBody Customers cust1) {
        cust.add(cust1);
        return new ApiResponse1("user add");
    }

    @PutMapping("/update/{index}")

    public ApiResponse1 updateCust(@PathVariable int index, @PathVariable Customers cust1) {
        cust.set(index, cust1);
        return new ApiResponse1("user updated");
    }

    @DeleteMapping("/{index}")
    public ApiResponse1 deledtCust(@PathVariable int index) {
        cust.remove(index);
        return new ApiResponse1("user added");


    }



        @PutMapping("/de")
        public ApiResponse1 depoSit(@PathVariable int ID @RequestBody double ba){
          for (int i =0 ;i<cust.size();i++){
         if(cust.get(i).getID()==ID) {
              cust.get(i).setBalance(cust.get(i).getBalance()+Ba);
                 return new ApiResponse1("deposit added!");
             }
            }
            return new ApiResponse1("not found");
        }
        @PutMapping("/wi")
        public ApiResponse1 withDrawy( @PathVariable int ID, @RequestBody double ba){
            cust.get(ID).setBalance( cust.get(ID).getBalance() - ba);
            return new ApiResponse1("witdraw successful");
        }


}



