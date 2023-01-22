@Service
public  class NameServiceImpl  implements NameService{
    private NameMapper nameMapper;
    public  NameServiceImpl(NameMapper nameMapper){
        this.nameMapper = nameMapper;
    }
    @Override
    public List<Name>findAll(){
        return  nameMapper.findAll();
    }
}