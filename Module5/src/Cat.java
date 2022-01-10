class Cat{
    private String _catName;

    public Cat(){}
    public Cat(String name){
        this._catName = name;
    }

    public void setName(String name){
        this._catName = name;
    }
    public String getName(){
        return this._catName;
    }
}
