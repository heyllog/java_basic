class User {
    int id
    String nickname

    User(int id, String nickname) {
        this.id = id
        this.nickname = nickname
    }

    Integer sum(Integer a, Integer b) {
        a + b
//        return a + b
    }

    fromBinding(Binding binding) {
        if (binding.getVariables().containsKey("id")) this.id = binding.getVariable("id")
        if (binding.getVariables().containsKey("nickname")) this.nickname = binding.getVariable("nickname")
    }

    @Override
    String toString() {
        return 'ID: ' + id + ', NickName: ' + nickname
    }

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    String getNickname() {
        return nickname
    }

    void setNickname(String nickname) {
        this.nickname = nickname
    }
}

