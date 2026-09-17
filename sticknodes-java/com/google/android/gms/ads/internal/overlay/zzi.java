package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzi {
    public final int zza;
    public final android.view.ViewGroup.LayoutParams zzb;
    public final android.view.ViewGroup zzc;
    public final android.content.Context zzd;

    public zzi(com.google.android.gms.internal.ads.zzcfo r3) throws com.google.android.gms.ads.internal.overlay.zzg {
            r2 = this;
            r2.<init>()
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r2.zzb = r0
            android.view.ViewParent r0 = r3.getParent()
            android.content.Context r1 = r3.zzE()
            r2.zzd = r1
            if (r0 == 0) goto L33
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L33
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2.zzc = r0
            android.view.View r1 = r3.zzF()
            int r1 = r0.indexOfChild(r1)
            r2.zza = r1
            android.view.View r1 = r3.zzF()
            r0.removeView(r1)
            r0 = 1
            r3.zzaq(r0)
            return
        L33:
            com.google.android.gms.ads.internal.overlay.zzg r3 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r0 = "Could not get the parent of the WebView for an overlay."
            r3.<init>(r0)
            throw r3
    }
}
