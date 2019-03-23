package koala.sloth.demo.bootstrap;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.domain.Order;
import koala.sloth.demo.respository.CustomerRepository;
import koala.sloth.demo.respository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class bootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    public bootStrapData(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       System.out.println("Loading customer data");

        Customer c1 = new Customer();
        c1.setNAME("elma");
        c1.setBRAND("");
        c1.setCATEGORY("Fruit");
        c1.setInTheFridge(0);
        c1.setPRICE((float) 2.00);
        c1.setPRICE_UNIT("TL");
        c1.setPHYSICAL_UNIT("KG");
        c1.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setNAME("portakal");
        c2.setBRAND("");
        c2.setCATEGORY("Fruit");
        c2.setInTheFridge(0);
        c2.setPRICE((float) 2.25);
        c2.setPRICE_UNIT("TL");
        c2.setPHYSICAL_UNIT("KG");
        c2.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setNAME("muz");
        c3.setBRAND("");
        c3.setCATEGORY("Fruit");
        c3.setInTheFridge(0);
        c3.setPRICE((float) 2.50);
        c3.setPRICE_UNIT("TL");
        c3.setPHYSICAL_UNIT("KG");
        c3.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c3);

        Customer c4 = new Customer();
        c4.setNAME("kivi");
        c4.setBRAND("");
        c4.setCATEGORY("Fruit");
        c4.setInTheFridge(0);
        c4.setPRICE((float) 2.75);
        c4.setPRICE_UNIT("TL");
        c4.setPHYSICAL_UNIT("KG");
        c4.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c4);

        Customer c5 = new Customer();
        c5.setNAME("cilek");
        c5.setBRAND("");
        c5.setCATEGORY("Fruit");
        c5.setInTheFridge(0);
        c5.setPRICE((float) 5.50);
        c5.setPRICE_UNIT("TL");
        c5.setPHYSICAL_UNIT("KG");
        c5.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c5);

        Customer c6 = new Customer();
        c6.setNAME("marul");
        c6.setBRAND("");
        c6.setCATEGORY("Vegetable");
        c6.setInTheFridge(0);
        c6.setPRICE((float) 1.50);
        c6.setPRICE_UNIT("TL");
        c6.setPHYSICAL_UNIT("KG");
        c6.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c6);

        Customer c7 = new Customer();
        c7.setNAME("lahana");
        c7.setBRAND("");
        c7.setCATEGORY("Vegetable");
        c7.setInTheFridge(0);
        c7.setPRICE((float) 2.50);
        c7.setPRICE_UNIT("TL");
        c7.setPHYSICAL_UNIT("KG");
        c7.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c7);

        Customer c8 = new Customer();
        c8.setNAME("turp");
        c8.setBRAND("");
        c8.setCATEGORY("Vegetable");
        c8.setInTheFridge(0);
        c8.setPRICE((float) 3.50);
        c8.setPRICE_UNIT("TL");
        c8.setPHYSICAL_UNIT("KG");
        c8.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c8);

        Customer c9 = new Customer();
        c9.setNAME("patlican");
        c9.setBRAND("");
        c9.setCATEGORY("Vegetable");
        c9.setInTheFridge(0);
        c9.setPRICE((float) 1.50);
        c9.setPRICE_UNIT("TL");
        c9.setPHYSICAL_UNIT("KG");
        c9.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c9);

        Customer c10 = new Customer();
        c10.setNAME("limon");
        c10.setBRAND("");
        c10.setCATEGORY("Fruit");
        c10.setInTheFridge(0);
        c10.setPRICE((float) 3.70);
        c10.setPRICE_UNIT("TL");
        c10.setPHYSICAL_UNIT("KG");
        c10.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c10);

        Customer c11 = new Customer();
        c11.setNAME("salatalik");
        c11.setBRAND("");
        c11.setCATEGORY("Vegetable");
        c11.setInTheFridge(0);
        c11.setPRICE((float) 1.25);
        c11.setPRICE_UNIT("TL");
        c11.setPHYSICAL_UNIT("KG");
        c11.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c11);

        Customer c12 = new Customer();
        c12.setNAME("havuc");
        c12.setBRAND("");
        c12.setCATEGORY("Vegetable");
        c12.setInTheFridge(0);
        c12.setPRICE((float) 2.25);
        c12.setPRICE_UNIT("TL");
        c12.setPHYSICAL_UNIT("KG");
        c12.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c12);

        Customer c13 = new Customer();
        c13.setNAME("biber");
        c13.setBRAND("");
        c13.setCATEGORY("Vegetable");
        c13.setInTheFridge(0);
        c13.setPRICE((float) 1.25);
        c13.setPRICE_UNIT("TL");
        c13.setPHYSICAL_UNIT("KG");
        c13.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c13);

        Customer c14 = new Customer();
        c14.setNAME("domates");
        c14.setBRAND("");
        c14.setCATEGORY("Vegetable");
        c14.setInTheFridge(0);
        c14.setPRICE((float) 1.25);
        c14.setPRICE_UNIT("TL");
        c14.setPHYSICAL_UNIT("KG");
        c14.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c14);

        Customer c15 = new Customer();
        c15.setNAME("karpuz");
        c15.setBRAND("");
        c15.setCATEGORY("Fruit");
        c15.setInTheFridge(0);
        c15.setPRICE((float) 1.25);
        c15.setPRICE_UNIT("TL");
        c15.setPHYSICAL_UNIT("KG");
        c15.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c15);

        Customer c16 = new Customer();
        c16.setNAME("fanta");
        c16.setBRAND("");
        c16.setCATEGORY("Drink");
        c16.setInTheFridge(0);
        c16.setPRICE((float) 4.50);
        c16.setPRICE_UNIT("TL");
        c16.setPHYSICAL_UNIT("piece");
        c16.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c16);

        Customer c17 = new Customer();
        c17.setNAME("gazoz");
        c17.setBRAND("");
        c17.setCATEGORY("Drink");
        c17.setInTheFridge(0);
        c17.setPRICE((float) 1.00);
        c17.setPRICE_UNIT("TL");
        c17.setPHYSICAL_UNIT("piece");
        c17.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c17);

        Customer c18 = new Customer();
        c18.setNAME("hardal");
        c18.setBRAND("");
        c18.setCATEGORY("Junk Food");
        c18.setInTheFridge(0);
        c18.setPRICE((float) 9.25);
        c18.setPRICE_UNIT("TL");
        c18.setPHYSICAL_UNIT("piece");
        c18.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c18);

        Customer c19 = new Customer();
        c19.setNAME("kasar");
        c19.setBRAND("");
        c19.setCATEGORY("Food");
        c19.setInTheFridge(0);
        c19.setPRICE((float) 7.50);
        c19.setPRICE_UNIT("TL");
        c19.setPHYSICAL_UNIT("piece");
        c19.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c19);

        Customer c20 = new Customer();
        c20.setNAME("ketcap");
        c20.setBRAND("");
        c20.setCATEGORY("Junk Food");
        c20.setInTheFridge(0);
        c20.setPRICE((float) 5.25);
        c20.setPRICE_UNIT("TL");
        c20.setPHYSICAL_UNIT("piece");
        c20.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c20);

        Customer c21 = new Customer();
        c21.setNAME("kola");
        c21.setBRAND("");
        c21.setCATEGORY("Drink");
        c21.setInTheFridge(0);
        c21.setPRICE((float) 3.75);
        c21.setPRICE_UNIT("TL");
        c21.setPHYSICAL_UNIT("piece");
        c21.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c21);

        Customer c22 = new Customer();
        c22.setNAME("limonata");
        c22.setBRAND("");
        c22.setCATEGORY("Drink");
        c22.setInTheFridge(0);
        c22.setPRICE((float) 4.50);
        c22.setPRICE_UNIT("TL");
        c22.setPHYSICAL_UNIT("piece");
        c22.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c22);

        Customer c23 = new Customer();
        c23.setNAME("mayonez");
        c23.setBRAND("");
        c23.setCATEGORY("Junk Food");
        c23.setInTheFridge(0);
        c23.setPRICE((float) 6.25);
        c23.setPRICE_UNIT("TL");
        c23.setPHYSICAL_UNIT("piece");
        c23.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c23);

        Customer c24 = new Customer();
        c24.setNAME("meyvesuyu");
        c24.setBRAND("");
        c24.setCATEGORY("Drink");
        c24.setInTheFridge(0);
        c24.setPRICE((float) 2.00);
        c24.setPRICE_UNIT("TL");
        c24.setPHYSICAL_UNIT("piece");
        c24.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c24);

        Customer c25 = new Customer();
        c25.setNAME("peynir");
        c25.setBRAND("");
        c25.setCATEGORY("Food");
        c25.setInTheFridge(0);
        c25.setPRICE((float) 1.25);
        c25.setPRICE_UNIT("TL");
        c25.setPHYSICAL_UNIT("piece");
        c25.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c25);

        Customer c26 = new Customer();
        c26.setNAME("soda");
        c26.setBRAND("");
        c26.setCATEGORY("Drink");
        c26.setInTheFridge(0);
        c26.setPRICE((float) 1.50);
        c26.setPRICE_UNIT("TL");
        c26.setPHYSICAL_UNIT("piece");
        c26.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c26);

        Customer c27 = new Customer();
        c27.setNAME("sut");
        c27.setBRAND("");
        c27.setCATEGORY("Drink");
        c27.setInTheFridge(0);
        c27.setPRICE((float) 2.00);
        c27.setPRICE_UNIT("TL");
        c27.setPHYSICAL_UNIT("piece");
        c27.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c27);

        Customer c28 = new Customer();
        c28.setNAME("tereyag");
        c28.setBRAND("");
        c28.setCATEGORY("Food");
        c28.setInTheFridge(0);
        c28.setPRICE((float) 15.00);
        c28.setPRICE_UNIT("TL");
        c28.setPHYSICAL_UNIT("piece");
        c28.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c28);

        Customer c29 = new Customer();
        c29.setNAME("yogurt");
        c29.setBRAND("");
        c29.setCATEGORY("Food");
        c29.setInTheFridge(0);
        c29.setPRICE((float) 3.00);
        c29.setPRICE_UNIT("TL");
        c29.setPHYSICAL_UNIT("piece");
        c29.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c29);

        Customer c30 = new Customer();
        c30.setNAME("yumurta");
        c30.setBRAND("");
        c30.setCATEGORY("Food");
        c30.setInTheFridge(0);
        c30.setPRICE((float) 7.25);
        c30.setPRICE_UNIT("TL");
        c30.setPHYSICAL_UNIT("piece");
        c30.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c30);

        Customer c31 = new Customer();
        c31.setNAME("potato");
        c31.setBRAND("");
        c31.setCATEGORY("Vegetable");
        c31.setInTheFridge(0);
        c31.setPRICE((float) 0.05);
        c31.setPRICE_UNIT("TL");
        c31.setPHYSICAL_UNIT("KG");
        c31.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c31);

        Customer c32 = new Customer();
        c32.setNAME("terderloin");
        c32.setBRAND("");
        c32.setCATEGORY("Meat");
        c32.setInTheFridge(0);
        c32.setPRICE((float) 10.00);
        c32.setPRICE_UNIT("TL");
        c32.setPHYSICAL_UNIT("KG");
        c32.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c32);

        Customer c33 = new Customer();
        c33.setNAME("entrecote");
        c33.setBRAND("");
        c33.setCATEGORY("Meat");
        c33.setInTheFridge(0);
        c33.setPRICE((float) 10.25);
        c33.setPRICE_UNIT("TL");
        c33.setPHYSICAL_UNIT("KG");
        c33.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c33);

        Customer c34 = new Customer();
        c34.setNAME("salami");
        c34.setBRAND("Pinar");
        c34.setCATEGORY("Meat");
        c34.setInTheFridge(0);
        c34.setPRICE((float) 10.50);
        c34.setPRICE_UNIT("TL");
        c34.setPHYSICAL_UNIT("piece");
        c34.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c34);

        Customer c35 = new Customer();
        c35.setNAME("sausage");
        c35.setBRAND("Pinar");
        c35.setCATEGORY("Meat");
        c35.setInTheFridge(0);
        c35.setPRICE((float) 10.75);
        c35.setPRICE_UNIT("TL");
        c35.setPHYSICAL_UNIT("piece");
        c35.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c35);

        Customer c36 = new Customer();
        c36.setNAME("hazelnut");
        c36.setBRAND("");
        c36.setCATEGORY("Nut");
        c36.setInTheFridge(0);
        c36.setPRICE((float) 15.00);
        c36.setPRICE_UNIT("TL");
        c36.setPHYSICAL_UNIT("KG");
        c36.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c36);

        Customer c37 = new Customer();
        c37.setNAME("peanut");
        c37.setBRAND("");
        c37.setCATEGORY("Nut");
        c37.setInTheFridge(0);
        c37.setPRICE((float) 15.25);
        c37.setPRICE_UNIT("TL");
        c37.setPHYSICAL_UNIT("KG");
        c37.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c37);

        Customer c38 = new Customer();
        c38.setNAME("coconut");
        c38.setBRAND("Diyar");
        c38.setCATEGORY("Spice");
        c38.setInTheFridge(0);
        c38.setPRICE((float) 1.25);
        c38.setPRICE_UNIT("TL");
        c38.setPHYSICAL_UNIT("piece");
        c38.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c38);

        Customer c39 = new Customer();
        c39.setNAME("tyhme");
        c39.setBRAND("Bagdat");
        c39.setCATEGORY("Spice");
        c39.setInTheFridge(0);
        c39.setPRICE((float) 1.50);
        c39.setPRICE_UNIT("TL");
        c39.setPHYSICAL_UNIT("piece");
        c39.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c39);

        Customer c40 = new Customer();
        c40.setNAME("mint");
        c40.setBRAND("Bagdat");
        c40.setCATEGORY("Spice");
        c40.setInTheFridge(0);
        c40.setPRICE((float) 1.75);
        c40.setPRICE_UNIT("TL");
        c40.setPHYSICAL_UNIT("piece");
        c40.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c40);

        Customer c41 = new Customer();
        c41.setNAME("hanimeller");
        c41.setBRAND("Ulker");
        c41.setCATEGORY("Junk Food");
        c41.setInTheFridge(0);
        c41.setPRICE((float) 5.00);
        c41.setPRICE_UNIT("TL");
        c41.setPHYSICAL_UNIT("piece");
        c41.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c41);

        Customer c42 = new Customer();
        c42.setNAME("ruffles");
        c42.setBRAND("");
        c42.setCATEGORY("Junk Food");
        c42.setInTheFridge(0);
        c42.setPRICE((float) 5.25);
        c42.setPRICE_UNIT("TL");
        c42.setPHYSICAL_UNIT("piece");
        c42.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c42);

        Customer c43 = new Customer();
        c43.setNAME("rocco");
        c43.setBRAND("");
        c43.setCATEGORY("Junk Food");
        c43.setInTheFridge(0);
        c43.setPRICE((float) 5.50);
        c43.setPRICE_UNIT("TL");
        c43.setPHYSICAL_UNIT("piece");
        c43.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c43);

        Customer c44 = new Customer();
        c44.setNAME("canga");
        c44.setBRAND("");
        c44.setCATEGORY("Junk Food");
        c44.setInTheFridge(0);
        c44.setPRICE((float) 5.75);
        c44.setPRICE_UNIT("TL");
        c44.setPHYSICAL_UNIT("piece");
        c44.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c44);

        Customer c45 = new Customer();
        c45.setNAME("toblerone");
        c45.setBRAND("");
        c45.setCATEGORY("Junk Food");
        c45.setInTheFridge(0);
        c45.setPRICE((float) 6.00);
        c45.setPRICE_UNIT("TL");
        c45.setPHYSICAL_UNIT("piece");
        c45.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c45);

        Customer c46 = new Customer();
        c46.setNAME("toffie");
        c46.setBRAND("");
        c46.setCATEGORY("Junk Food");
        c46.setInTheFridge(0);
        c46.setPRICE((float) 6.25);
        c46.setPRICE_UNIT("TL");
        c46.setPHYSICAL_UNIT("piece");
        c46.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c46);

        Customer c47 = new Customer();
        c47.setNAME("shampoo");
        c47.setBRAND("HS");
        c47.setCATEGORY("Cleaning");
        c47.setInTheFridge(0);
        c47.setPRICE((float) 7.25);
        c47.setPRICE_UNIT("TL");
        c47.setPHYSICAL_UNIT("piece");
        c47.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c47);

        Customer c48 = new Customer();
        c48.setNAME("shampoo");
        c48.setBRAND("HS");
        c48.setCATEGORY("Cleaning");
        c48.setInTheFridge(0);
        c48.setPRICE((float) 7.25);
        c48.setPRICE_UNIT("TL");
        c48.setPHYSICAL_UNIT("piece");
        c48.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c48);

        Customer c49 = new Customer();
        c49.setNAME("toiletpaper");
        c49.setBRAND("HS");
        c49.setCATEGORY("Cleaning");
        c49.setInTheFridge(0);
        c49.setPRICE((float) 8.25);
        c49.setPRICE_UNIT("TL");
        c49.setPHYSICAL_UNIT("piece");
        c49.setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(c49);


        System.out.println("Customer Saved : "+customerRepository.count());

    }
}
