package programmer.zaman.now.data;

class SocialMedia {

    String name;

}

class Facebook extends SocialMedia {

    final void login(String username, String password) {
        // Isi Method
    }

}

class FakeFacebook extends Facebook {

//    ERROR
//    void login(String username, String password) {
//        // Isi Method
//    }

}