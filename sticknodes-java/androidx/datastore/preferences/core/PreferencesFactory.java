package androidx.datastore.preferences.core;

/* compiled from: PreferencesFactory.kt */
/* loaded from: classes.dex */
public final class PreferencesFactory {
    public static final androidx.datastore.preferences.core.Preferences createEmpty() {
            androidx.datastore.preferences.core.MutablePreferences r0 = new androidx.datastore.preferences.core.MutablePreferences
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r2, r1)
            return r0
    }

    public static final androidx.datastore.preferences.core.MutablePreferences createMutable(androidx.datastore.preferences.core.Preferences.Pair<?>... r4) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.datastore.preferences.core.MutablePreferences r0 = new androidx.datastore.preferences.core.MutablePreferences
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3, r1)
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            androidx.datastore.preferences.core.Preferences$Pair[] r4 = (androidx.datastore.preferences.core.Preferences.Pair[]) r4
            r0.putAll(r4)
            return r0
    }
}
