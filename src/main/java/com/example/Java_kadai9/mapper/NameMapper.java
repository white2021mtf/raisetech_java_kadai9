@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name>findAll();

    @Select("SELECT * FROM names WHERE id = #{id}")
    Optional<Name>findById(int id);
}