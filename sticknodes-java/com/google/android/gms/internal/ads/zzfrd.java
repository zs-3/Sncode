package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfrd extends com.google.android.gms.internal.ads.zzfra {
    private java.lang.String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    zzfrd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final com.google.android.gms.internal.ads.zzfra zza(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "Null clientVersion"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zza = r2
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final com.google.android.gms.internal.ads.zzfra zzb(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzc = r1
            byte r1 = r0.zzd
            r1 = r1 | 2
            byte r1 = (byte) r1
            r0.zzd = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final com.google.android.gms.internal.ads.zzfra zzc(boolean r1) {
            r0 = this;
            r0.zzb = r1
            byte r1 = r0.zzd
            r1 = r1 | 1
            byte r1 = (byte) r1
            r0.zzd = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public final com.google.android.gms.internal.ads.zzfrb zzd() {
            r5 = this;
            byte r0 = r5.zzd
            r1 = 3
            if (r0 != r1) goto L15
            java.lang.String r0 = r5.zza
            if (r0 != 0) goto La
            goto L15
        La:
            com.google.android.gms.internal.ads.zzfrf r1 = new com.google.android.gms.internal.ads.zzfrf
            boolean r2 = r5.zzb
            boolean r3 = r5.zzc
            r4 = 0
            r1.<init>(r0, r2, r3, r4)
            return r1
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.zza
            if (r1 != 0) goto L23
            java.lang.String r1 = " clientVersion"
            r0.append(r1)
        L23:
            byte r1 = r5.zzd
            r1 = r1 & 1
            if (r1 != 0) goto L2e
            java.lang.String r1 = " shouldGetAdvertisingId"
            r0.append(r1)
        L2e:
            byte r1 = r5.zzd
            r1 = r1 & 2
            if (r1 != 0) goto L39
            java.lang.String r1 = " isGooglePlayServicesAvailable"
            r0.append(r1)
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
