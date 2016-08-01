package module;

import com.example.chenwenping.mydagger.DaggerPresenter;
import com.example.chenwenping.mydagger.MainActivity;

import bean.User;
import dagger.Module;
import dagger.Provides;

/**
 * Created by chenwenping on 16/8/1.
 */
@Module
public class ActivityModule {
    private MainActivity daggerActivity;

    public ActivityModule(MainActivity daggerActivity) {
        this.daggerActivity = daggerActivity;
    }

    @Provides
    public MainActivity provideDaggerActivity() {
        return daggerActivity;
    }

    @Provides
    public User provideUser() {
        return new User("user from ActivityModule");
    }

    @Provides
    public DaggerPresenter provideDaggerPresenter(MainActivity daggerActivity, User user) {
        return new DaggerPresenter(daggerActivity, user);
    }
}
