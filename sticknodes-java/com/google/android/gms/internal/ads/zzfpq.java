package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpq implements com.google.android.gms.internal.ads.zzfpn {
    private final int[] zza;

    public zzfpq() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final org.json.JSONObject zza(android.view.View r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L8
            org.json.JSONObject r5 = com.google.android.gms.internal.ads.zzfpx.zza(r0, r0, r0, r0)
            return r5
        L8:
            int[] r1 = r4.zza
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            r5.getLocationOnScreen(r1)
            int[] r5 = r4.zza
            r0 = r5[r0]
            r1 = 1
            r5 = r5[r1]
            org.json.JSONObject r5 = com.google.android.gms.internal.ads.zzfpx.zza(r0, r5, r2, r3)
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzb(android.view.View r8, org.json.JSONObject r9, com.google.android.gms.internal.ads.zzfpm r10, boolean r11, boolean r12) {
            r7 = this;
            boolean r0 = r8 instanceof android.view.ViewGroup
            if (r0 != 0) goto L6
            goto L87
        L6:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r0 = 0
            if (r11 == 0) goto L77
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r1 = 0
        L11:
            int r2 = r8.getChildCount()
            if (r1 >= r2) goto L41
            android.view.View r2 = r8.getChildAt(r1)
            float r3 = r2.getZ()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r3 = r11.get(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto L3b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            float r4 = r2.getZ()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r11.put(r4, r3)
        L3b:
            r3.add(r2)
            int r1 = r1 + 1
            goto L11
        L41:
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.Set r1 = r11.keySet()
            r8.<init>(r1)
            java.util.Collections.sort(r8)
            int r1 = r8.size()
            r2 = 0
        L52:
            if (r2 >= r1) goto L87
            java.lang.Object r3 = r8.get(r2)
            java.lang.Float r3 = (java.lang.Float) r3
            java.lang.Object r3 = r11.get(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r5 = 0
        L65:
            int r6 = r2 + 1
            if (r5 >= r4) goto L75
            java.lang.Object r6 = r3.get(r5)
            android.view.View r6 = (android.view.View) r6
            r10.zza(r6, r7, r9, r12)
            int r5 = r5 + 1
            goto L65
        L75:
            r2 = r6
            goto L52
        L77:
            int r11 = r8.getChildCount()
            if (r0 >= r11) goto L87
            android.view.View r11 = r8.getChildAt(r0)
            r10.zza(r11, r7, r9, r12)
            int r0 = r0 + 1
            goto L77
        L87:
            return
    }
}
