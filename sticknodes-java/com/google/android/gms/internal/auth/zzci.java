package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzci {
    private final androidx.collection.SimpleArrayMap zza;

    zzci(androidx.collection.SimpleArrayMap r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.lang.String zza(android.net.Uri r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r2 = 0
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.toString()
            androidx.collection.SimpleArrayMap r3 = r0.zza
            java.lang.Object r1 = r3.get(r1)
            androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
            goto L11
        L10:
            r1 = r2
        L11:
            if (r1 != 0) goto L14
            return r2
        L14:
            java.lang.String r2 = ""
            java.lang.String r2 = r2.concat(r4)
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }
}
