package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzl extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zza;

    /* synthetic */ zzl(com.google.android.gms.ads.internal.overlay.zzm r1, com.google.android.gms.ads.internal.overlay.zzk r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
            r7 = this;
            com.google.android.gms.ads.internal.overlay.zzm r0 = r7.zza
            com.google.android.gms.ads.internal.util.zzbu r1 = com.google.android.gms.ads.internal.zzu.zzu()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r0.zzc
            com.google.android.gms.ads.internal.zzk r0 = r0.zzo
            int r0 = r0.zzf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.graphics.Bitmap r0 = r1.zza(r0)
            if (r0 == 0) goto L8b
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.overlay.zzm r1 = r7.zza
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzc
            com.google.android.gms.ads.internal.zzk r2 = r2.zzo
            boolean r3 = r2.zzd
            float r2 = r2.zze
            android.app.Activity r1 = r1.zzb
            if (r3 == 0) goto L78
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L78
            r3 = 1103626240(0x41c80000, float:25.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L33
            goto L78
        L33:
            int r3 = r0.getWidth()     // Catch: java.lang.RuntimeException -> L6e
            int r4 = r0.getHeight()     // Catch: java.lang.RuntimeException -> L6e
            r5 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r0, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L6e
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L6e
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r1)     // Catch: java.lang.RuntimeException -> L6e
            android.renderscript.Element r6 = android.renderscript.Element.U8_4(r5)     // Catch: java.lang.RuntimeException -> L6e
            android.renderscript.ScriptIntrinsicBlur r6 = android.renderscript.ScriptIntrinsicBlur.create(r5, r6)     // Catch: java.lang.RuntimeException -> L6e
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r5, r3)     // Catch: java.lang.RuntimeException -> L6e
            android.renderscript.Allocation r5 = android.renderscript.Allocation.createFromBitmap(r5, r4)     // Catch: java.lang.RuntimeException -> L6e
            r6.setRadius(r2)     // Catch: java.lang.RuntimeException -> L6e
            r6.setInput(r3)     // Catch: java.lang.RuntimeException -> L6e
            r6.forEach(r5)     // Catch: java.lang.RuntimeException -> L6e
            r5.copyTo(r4)     // Catch: java.lang.RuntimeException -> L6e
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.RuntimeException -> L6e
            android.content.res.Resources r3 = r1.getResources()     // Catch: java.lang.RuntimeException -> L6e
            r2.<init>(r3, r4)     // Catch: java.lang.RuntimeException -> L6e
            goto L81
        L6e:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r1.getResources()
            r2.<init>(r1, r0)
            goto L81
        L78:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r1.getResources()
            r2.<init>(r1, r0)
        L81:
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.ads.internal.overlay.zzj r1 = new com.google.android.gms.ads.internal.overlay.zzj
            r1.<init>(r7, r2)
            r0.post(r1)
        L8b:
            return
    }
}
