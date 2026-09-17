package androidx.core.content;

/* loaded from: classes.dex */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r1);

    void removeOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r1);
}
