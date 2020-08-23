import com.turchyn.hometask.pojo.BeanValidator;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if(bean instanceof BeanValidator){
            ((BeanValidator)bean).validate();
        }
        return bean;
    }
}
