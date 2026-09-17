package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhij implements com.google.android.gms.internal.ads.zzhii, com.google.android.gms.internal.ads.zzhic {
    private static final com.google.android.gms.internal.ads.zzhij zza = null;
    private final java.lang.Object zzb;

    static {
            com.google.android.gms.internal.ads.zzhij r0 = new com.google.android.gms.internal.ads.zzhij
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzhij.zza = r0
            return
    }

    private zzhij(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzhii zza(java.lang.Object r2) {
            com.google.android.gms.internal.ads.zzhij r0 = new com.google.android.gms.internal.ads.zzhij
            java.lang.String r1 = "instance cannot be null"
            com.google.android.gms.internal.ads.zzhiq.zza(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzhii zzc(java.lang.Object r1) {
            if (r1 != 0) goto L5
            com.google.android.gms.internal.ads.zzhij r1 = com.google.android.gms.internal.ads.zzhij.zza
            goto Lb
        L5:
            com.google.android.gms.internal.ads.zzhij r0 = new com.google.android.gms.internal.ads.zzhij
            r0.<init>(r1)
            r1 = r0
        Lb:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final java.lang.Object zzb() {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            return r0
    }
}
