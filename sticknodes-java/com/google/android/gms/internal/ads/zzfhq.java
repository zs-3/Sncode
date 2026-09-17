package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfhq {
    public static android.os.Bundle zza(android.os.Bundle r0, java.lang.String r1) {
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        Lb:
            return r0
    }

    public static void zzb(android.os.Bundle r0, java.lang.String r1, android.os.Bundle r2) {
            if (r2 == 0) goto L5
            r0.putBundle(r1, r2)
        L5:
            return
    }

    public static void zzc(android.os.Bundle r0, java.lang.String r1, java.lang.String r2) {
            if (r2 == 0) goto L5
            r0.putString(r1, r2)
        L5:
            return
    }

    public static void zzd(android.os.Bundle r1, java.lang.String r2, java.util.List r3) {
            if (r3 == 0) goto La
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r1.putStringArrayList(r2, r0)
        La:
            return
    }

    public static void zze(android.os.Bundle r0, java.lang.String r1, int r2, boolean r3) {
            if (r3 == 0) goto L5
            r0.putInt(r1, r2)
        L5:
            return
    }

    public static void zzf(android.os.Bundle r0, java.lang.String r1, java.lang.String r2, boolean r3) {
            if (r3 == 0) goto L7
            if (r2 == 0) goto L7
            r0.putString(r1, r2)
        L7:
            return
    }

    public static void zzg(android.os.Bundle r0, java.lang.String r1, boolean r2, boolean r3) {
            if (r3 == 0) goto L5
            r0.putBoolean(r1, r2)
        L5:
            return
    }
}
