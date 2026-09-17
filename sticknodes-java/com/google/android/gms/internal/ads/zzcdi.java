package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcdi extends com.google.android.gms.internal.ads.zzarl {
    static final com.google.android.gms.internal.ads.zzcdi zzb = null;

    static {
            com.google.android.gms.internal.ads.zzcdi r0 = new com.google.android.gms.internal.ads.zzcdi
            r0.<init>()
            com.google.android.gms.internal.ads.zzcdi.zzb = r0
            return
    }

    zzcdi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzarl
    public final com.google.android.gms.internal.ads.zzarp zza(java.lang.String r1, byte[] r2, java.lang.String r3) {
            r0 = this;
            java.lang.String r2 = "moov"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Le
            com.google.android.gms.internal.ads.zzarr r1 = new com.google.android.gms.internal.ads.zzarr
            r1.<init>()
            return r1
        Le:
            java.lang.String r2 = "mvhd"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1c
            com.google.android.gms.internal.ads.zzars r1 = new com.google.android.gms.internal.ads.zzars
            r1.<init>()
            return r1
        L1c:
            com.google.android.gms.internal.ads.zzart r2 = new com.google.android.gms.internal.ads.zzart
            r2.<init>(r1)
            return r2
    }
}
