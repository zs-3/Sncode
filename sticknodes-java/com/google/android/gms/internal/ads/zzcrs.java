package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcrs implements com.google.android.gms.internal.ads.zzcyu {
    private final com.google.android.gms.internal.ads.zzcfo zza;
    private final com.google.android.gms.internal.ads.zzdud zzb;
    private final com.google.android.gms.internal.ads.zzfgh zzc;

    zzcrs(com.google.android.gms.internal.ads.zzcfo r1, com.google.android.gms.internal.ads.zzdud r2, com.google.android.gms.internal.ads.zzfgh r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmw
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L58
            com.google.android.gms.internal.ads.zzcfo r0 = r5.zza
            if (r0 == 0) goto L58
            android.view.View r0 = r0.zzF()
            android.view.ViewParent r0 = r0.getParent()
        L1e:
            r1 = 1
            if (r0 == 0) goto L38
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "androidx.compose.ui"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L33
            r0 = 1
            goto L39
        L33:
            android.view.ViewParent r0 = r0.getParent()
            goto L1e
        L38:
            r0 = 0
        L39:
            com.google.android.gms.internal.ads.zzdud r2 = r5.zzb
            com.google.android.gms.internal.ads.zzduc r2 = r2.zza()
            java.lang.String r3 = "action"
            java.lang.String r4 = "hcp"
            r2.zzb(r3, r4)
            if (r1 == r0) goto L4b
            java.lang.String r0 = "0"
            goto L4d
        L4b:
            java.lang.String r0 = "1"
        L4d:
            r2.zzb(r4, r0)
            com.google.android.gms.internal.ads.zzfgh r0 = r5.zzc
            r2.zzc(r0)
            r2.zzf()
        L58:
            return
    }
}
