package component;

import javax.inject.Singleton;

import bean.User;
import dagger.Component;
import module.ApiModule;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by chenwenping on 16/8/1.
 */
@Singleton
@Component(modules = ApiModule.class)
public interface AppComponent {
/*    void inject(OkHttpClient okHttpClient);

    void inject(Retrofit retrofit);

    void inject(User user);*/

    OkHttpClient getClient();

    Retrofit getRetrofit();

    User getUser();
}
