package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpc extends com.google.android.gms.internal.ads.zzfpf {

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static final com.google.android.gms.internal.ads.zzfpc zzb = null;

    static {
            com.google.android.gms.internal.ads.zzfpc r0 = new com.google.android.gms.internal.ads.zzfpc
            r0.<init>()
            com.google.android.gms.internal.ads.zzfpc.zzb = r0
            return
    }

    private zzfpc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzfpc zza() {
            com.google.android.gms.internal.ads.zzfpc r0 = com.google.android.gms.internal.ads.zzfpc.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzb(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            java.util.Collection r0 = r0.zzc()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            com.google.android.gms.internal.ads.zzfpr r1 = r1.zzg()
            r1.zzk(r3)
            goto Lc
        L20:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final boolean zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            java.util.Collection r0 = r0.zzb()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            android.view.View r1 = r1.zzf()
            if (r1 == 0) goto Lc
            boolean r1 = r1.hasWindowFocus()
            if (r1 == 0) goto Lc
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }
}
