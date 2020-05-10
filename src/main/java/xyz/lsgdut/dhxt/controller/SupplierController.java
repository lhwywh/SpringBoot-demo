//package xyz.lsgdut.dhxt.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import xyz.lsgdut.dhxt.pojo.Supplier;
//import xyz.lsgdut.dhxt.utils.JSONResult;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Controller
//@RequestMapping("/dhxt/supplier")
//public class SupplierController {
//
//
//    @Autowired
//    private SupplierService supplierService;
//
//    @RequestMapping("/getOneSupplierById")
//    @ResponseBody
//    public JSONResult getOneSupplierById(@RequestParam(value = "supplierId", required = true, defaultValue = "-1") int id) {
//        Supplier supplier = supplierService.getOneSupplierById(id);
//        if (supplier == null) {
//            return JSONResult.errorMsg("找不到这个供应商");
//        } else {
//            return JSONResult.ok(supplier);
//        }
//    }
//
//    @RequestMapping(value = "/addOneSupplier")
//    @ResponseBody
//    public JSONResult addOneSupplier(@ModelAttribute Supplier supplier) {
//        String msg = supplierService.addOneSupplier(supplier);
//        if (msg.contains("成功")){
//            return JSONResult.ok(msg);
//        }else{
//            return JSONResult.errorMsg(msg);
//        }
//    }
//
//    @RequestMapping(value = "/getAllSuppliers")
//    @ResponseBody
//    public JSONResult getAllSuppliers() {
//        List<Supplier> suppliers = new ArrayList<>();
//        suppliers=supplierService.getAllSuppliers();
//        if (suppliers.isEmpty()) {
//            return JSONResult.errorMsg("还没有零件信息");
//        } else {
//            return JSONResult.ok(suppliers);
//        }
//    }
//
//    @RequestMapping("/updateOneSupplier")
//    @ResponseBody
//    public JSONResult updateSupplier(@ModelAttribute Supplier supplier) {
//        String msg = supplierService.updateOneSupplier(supplier);
//        if (msg!=null){
//            if (msg.contains("成功"))
//                return JSONResult.ok(msg);
//            else{
//                return JSONResult.errorMsg(msg);
//            }
//        }else{
//            return JSONResult.errorMsg("控制层出现问题");
//        }
//    }
//
//    @RequestMapping("/deleteSupplier")
//    @ResponseBody
//    public JSONResult deleteSupplier( @RequestParam(value = "supplierId", required = true, defaultValue = "-1") int id ) {
//        String msg = supplierService.deleteOneSupplier(id);
//
//        if (msg.contains("成功")){
//            return JSONResult.ok(msg);
//        }else{
//            return  JSONResult.errorMsg(msg);
//        }
//    }
//
//}
