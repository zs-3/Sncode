package androidx.datastore.preferences;

/* compiled from: PreferencesMapCompat.kt */
/* loaded from: classes.dex */
public final class PreferencesMapCompat {
    public static final androidx.datastore.preferences.PreferencesMapCompat.Companion Companion = null;

    /* compiled from: PreferencesMapCompat.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final androidx.datastore.preferences.PreferencesProto$PreferenceMap readFrom(java.io.InputStream r3) {
                r2 = this;
                java.lang.String r0 = "input"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.datastore.preferences.PreferencesProto$PreferenceMap r3 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.parseFrom(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> Lf
                java.lang.String r0 = "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> Lf
                return r3
            Lf:
                r3 = move-exception
                androidx.datastore.core.CorruptionException r0 = new androidx.datastore.core.CorruptionException
                java.lang.String r1 = "Unable to parse preferences proto."
                r0.<init>(r1, r3)
                throw r0
        }
    }

    static {
            androidx.datastore.preferences.PreferencesMapCompat$Companion r0 = new androidx.datastore.preferences.PreferencesMapCompat$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.datastore.preferences.PreferencesMapCompat.Companion = r0
            return
    }
}
