package androidx.datastore.preferences.core;

/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public abstract class Preferences {

    /* compiled from: Preferences.kt */
    public static final class Key<T> {
        private final java.lang.String name;

        public Key(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.name = r2
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.datastore.preferences.core.Preferences.Key
                if (r0 == 0) goto Lf
                java.lang.String r0 = r1.name
                androidx.datastore.preferences.core.Preferences$Key r2 = (androidx.datastore.preferences.core.Preferences.Key) r2
                java.lang.String r2 = r2.name
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                goto L10
            Lf:
                r2 = 0
            L10:
                return r2
        }

        public final java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.name
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    /* compiled from: Preferences.kt */
    public static final class Pair<T> {
        private final androidx.datastore.preferences.core.Preferences.Key<T> key;
        private final T value;

        public final androidx.datastore.preferences.core.Preferences.Key<T> getKey$datastore_preferences_core() {
                r1 = this;
                androidx.datastore.preferences.core.Preferences$Key<T> r0 = r1.key
                return r0
        }

        public final T getValue$datastore_preferences_core() {
                r1 = this;
                T r0 = r1.value
                return r0
        }
    }

    public Preferences() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> asMap();

    public abstract <T> T get(androidx.datastore.preferences.core.Preferences.Key<T> r1);

    public final androidx.datastore.preferences.core.MutablePreferences toMutablePreferences() {
            r3 = this;
            androidx.datastore.preferences.core.MutablePreferences r0 = new androidx.datastore.preferences.core.MutablePreferences
            java.util.Map r1 = r3.asMap()
            java.util.Map r1 = kotlin.collections.MapsKt.toMutableMap(r1)
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public final androidx.datastore.preferences.core.Preferences toPreferences() {
            r3 = this;
            androidx.datastore.preferences.core.MutablePreferences r0 = new androidx.datastore.preferences.core.MutablePreferences
            java.util.Map r1 = r3.asMap()
            java.util.Map r1 = kotlin.collections.MapsKt.toMutableMap(r1)
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }
}
