package com.google.android.gms.internal.ads_identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public final class zzc {
    private static final java.lang.ClassLoader zza = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads_identifier.zzc> r0 = com.google.android.gms.internal.ads_identifier.zzc.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            com.google.android.gms.internal.ads_identifier.zzc.zza = r0
            return
    }

    private zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zza(android.os.Parcel r0, boolean r1) {
            r1 = 1
            r0.writeInt(r1)
            return
    }

    public static boolean zzb(android.os.Parcel r0) {
            int r0 = r0.readInt()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
