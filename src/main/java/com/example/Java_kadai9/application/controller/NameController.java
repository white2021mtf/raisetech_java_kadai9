@RestController
public  class NameController {
    private final  NameService nameService;

    public  NameController(NameService nameService){
        this.nameService = nameService;
    }
    @GetMapping("/names")
    public  List<NameResponse>getNames(){
        return nameService.findAll().stream().map(NameResponse::new).toList();
    }
}