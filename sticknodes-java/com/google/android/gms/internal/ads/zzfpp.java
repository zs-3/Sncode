package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpp implements com.google.android.gms.internal.ads.zzfpn {
    private final com.google.android.gms.internal.ads.zzfpn zza;

    public zzfpp(com.google.android.gms.internal.ads.zzfpn r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final org.json.JSONObject zza(android.view.View r4) {
            r3 = this;
            r4 = 0
            org.json.JSONObject r0 = com.google.android.gms.internal.ads.zzfpx.zza(r4, r4, r4, r4)
            int r1 = com.google.android.gms.internal.ads.zzfqa.zzb()
            int r2 = r1 + (-1)
            if (r1 == 0) goto L1e
            if (r2 == 0) goto L10
            goto L11
        L10:
            r4 = 1
        L11:
            java.lang.String r1 = "noOutputDevice"
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L17
            goto L1d
        L17:
            r4 = move-exception
            java.lang.String r1 = "Error with setting output device status"
            com.google.android.gms.internal.ads.zzfpy.zza(r1, r4)
        L1d:
            return r0
        L1e:
            r4 = 0
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzb(android.view.View r7, org.json.JSONObject r8, com.google.android.gms.internal.ads.zzfpm r9, boolean r10, boolean r11) {
            r6 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.android.gms.internal.ads.zzfpd r10 = com.google.android.gms.internal.ads.zzfpd.zza()
            if (r10 == 0) goto L85
            java.util.Collection r10 = r10.zzb()
            int r0 = r10.size()
            int r0 = r0 + r0
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            int r0 = r0 + 3
            r1.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L1f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r10.next()
            com.google.android.gms.internal.ads.zzfom r0 = (com.google.android.gms.internal.ads.zzfom) r0
            android.view.View r0 = r0.zzf()
            if (r0 == 0) goto L1f
            boolean r2 = r0.isAttachedToWindow()
            if (r2 == 0) goto L1f
            boolean r2 = r0.isShown()
            if (r2 == 0) goto L1f
            r2 = r0
        L3e:
            if (r2 == 0) goto L56
            float r3 = r2.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L1f
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L54
            android.view.View r2 = (android.view.View) r2
            goto L3e
        L54:
            r2 = 0
            goto L3e
        L56:
            android.view.View r0 = r0.getRootView()
            if (r0 == 0) goto L1f
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L1f
            r1.put(r0, r0)
            float r2 = r0.getZ()
            int r3 = r7.size()
        L6d:
            if (r3 <= 0) goto L81
            int r4 = r3 + (-1)
            java.lang.Object r5 = r7.get(r4)
            android.view.View r5 = (android.view.View) r5
            float r5 = r5.getZ()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L81
            r3 = r4
            goto L6d
        L81:
            r7.add(r3, r0)
            goto L1f
        L85:
            int r10 = r7.size()
            r0 = 0
        L8a:
            if (r0 >= r10) goto L9a
            java.lang.Object r1 = r7.get(r0)
            android.view.View r1 = (android.view.View) r1
            com.google.android.gms.internal.ads.zzfpn r2 = r6.zza
            r9.zza(r1, r2, r8, r11)
            int r0 = r0 + 1
            goto L8a
        L9a:
            return
    }
}
