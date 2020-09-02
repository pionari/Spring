package com.test02;

public class Address {
   private String name;
   private String addr;
   private String phone;
   
   public Address() {
      
   }
   
   public Address(String name, String addr, String phone) {
      this.name = name;
      this.addr = addr;
      this.phone = phone;
   }
   
   public String toString() {
      return "이름 : " + name + "\t주소 : " + addr + "\t전화번호 : " + phone;
   }
}