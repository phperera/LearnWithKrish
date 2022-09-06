package services;
import org.springframework.stereotype.Service;

    @Service
    public class RentProcessServiceImpl implements RentProcessService {

    @Override
    public boolean validate(String dlNumber){

        return dlNumer.length()>5;
}
}
