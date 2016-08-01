package component;

import com.example.chenwenping.mydagger.MainActivity;

import dagger.Component;
import module.ActivityModule;

/**
 * Created by chenwenping on 16/8/1.
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity daggerActivity);
}
