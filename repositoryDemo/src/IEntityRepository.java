public interface IEntityRepository<T extends IEntity>{

    void create(T value);
    void delete(T value);
    void update(T value);


}
