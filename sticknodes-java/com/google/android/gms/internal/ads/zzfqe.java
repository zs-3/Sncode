package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqe {
    private final java.util.HashMap zza;
    private final java.util.HashMap zzb;
    private final java.util.HashMap zzc;
    private final java.util.HashSet zzd;
    private final java.util.HashSet zze;
    private final java.util.HashSet zzf;
    private final java.util.HashMap zzg;
    private final java.util.Map zzh;
    private boolean zzi;

    public zzfqe() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzc = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzd = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zze = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzf = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzg = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.zzh = r0
            return
    }

    public final android.view.View zza(java.lang.String r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzc
            java.lang.Object r2 = r0.get(r2)
            android.view.View r2 = (android.view.View) r2
            return r2
    }

    public final com.google.android.gms.internal.ads.zzfqd zzb(android.view.View r3) {
            r2 = this;
            java.util.HashMap r0 = r2.zzb
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzfqd r0 = (com.google.android.gms.internal.ads.zzfqd) r0
            if (r0 == 0) goto Lf
            java.util.HashMap r1 = r2.zzb
            r1.remove(r3)
        Lf:
            return r0
    }

    public final java.lang.String zzc(java.lang.String r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzg
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final java.lang.String zzd(android.view.View r3) {
            r2 = this;
            java.util.HashMap r0 = r2.zza
            int r0 = r0.size()
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            java.util.HashMap r0 = r2.zza
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L19
            java.util.HashMap r1 = r2.zza
            r1.remove(r3)
        L19:
            return r0
    }

    public final java.util.HashSet zze() {
            r1 = this;
            java.util.HashSet r0 = r1.zzf
            return r0
    }

    public final java.util.HashSet zzf() {
            r1 = this;
            java.util.HashSet r0 = r1.zze
            return r0
    }

    public final void zzg() {
            r1 = this;
            java.util.HashMap r0 = r1.zza
            r0.clear()
            java.util.HashMap r0 = r1.zzb
            r0.clear()
            java.util.HashMap r0 = r1.zzc
            r0.clear()
            java.util.HashSet r0 = r1.zzd
            r0.clear()
            java.util.HashSet r0 = r1.zze
            r0.clear()
            java.util.HashSet r0 = r1.zzf
            r0.clear()
            java.util.HashMap r0 = r1.zzg
            r0.clear()
            r0 = 0
            r1.zzi = r0
            return
    }

    public final void zzh() {
            r1 = this;
            r0 = 1
            r1.zzi = r0
            return
    }

    public final void zzi() {
            r9 = this;
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            if (r0 == 0) goto Lf8
            java.util.Collection r0 = r0.zzb()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf8
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            android.view.View r2 = r1.zzf()
            boolean r3 = r1.zzj()
            if (r3 == 0) goto Le
            java.lang.String r3 = r1.zzh()
            if (r2 == 0) goto Lea
            boolean r4 = r2.isAttachedToWindow()
            r5 = 0
            java.lang.String r6 = "noWindowFocus"
            if (r4 != 0) goto L36
            java.lang.String r5 = "notAttached"
            goto L8a
        L36:
            boolean r4 = r2.hasWindowFocus()
            if (r4 == 0) goto L44
            java.util.Map r4 = r9.zzh
            r4.remove(r2)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L5d
        L44:
            java.util.Map r4 = r9.zzh
            boolean r4 = r4.containsKey(r2)
            if (r4 == 0) goto L55
            java.util.Map r4 = r9.zzh
            java.lang.Object r4 = r4.get(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            goto L5d
        L55:
            java.util.Map r4 = r9.zzh
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r4.put(r2, r7)
            r4 = r7
        L5d:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L65
            r5 = r6
            goto L8a
        L65:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r7 = r2
        L6b:
            if (r7 == 0) goto L85
            java.lang.String r8 = com.google.android.gms.internal.ads.zzfqc.zza(r7)
            if (r8 == 0) goto L75
            r5 = r8
            goto L8a
        L75:
            r4.add(r7)
            android.view.ViewParent r7 = r7.getParent()
            boolean r8 = r7 instanceof android.view.View
            if (r8 == 0) goto L83
            android.view.View r7 = (android.view.View) r7
            goto L6b
        L83:
            r7 = r5
            goto L6b
        L85:
            java.util.HashSet r7 = r9.zzd
            r7.addAll(r4)
        L8a:
            if (r5 != 0) goto Ld7
            java.util.HashSet r4 = r9.zze
            r4.add(r3)
            java.util.HashMap r4 = r9.zza
            r4.put(r2, r3)
            java.util.List r2 = r1.zzi()
            java.util.Iterator r2 = r2.iterator()
        L9e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Le
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzfpg r3 = (com.google.android.gms.internal.ads.zzfpg) r3
            com.google.android.gms.internal.ads.zzfqs r4 = r3.zzb()
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L9e
            java.util.HashMap r5 = r9.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.zzfqd r5 = (com.google.android.gms.internal.ads.zzfqd) r5
            if (r5 == 0) goto Lc8
            java.lang.String r3 = r1.zzh()
            r5.zzc(r3)
            goto L9e
        Lc8:
            java.util.HashMap r5 = r9.zzb
            com.google.android.gms.internal.ads.zzfqd r6 = new com.google.android.gms.internal.ads.zzfqd
            java.lang.String r7 = r1.zzh()
            r6.<init>(r3, r7)
            r5.put(r4, r6)
            goto L9e
        Ld7:
            if (r5 == r6) goto Le
            java.util.HashSet r1 = r9.zzf
            r1.add(r3)
            java.util.HashMap r1 = r9.zzc
            r1.put(r3, r2)
            java.util.HashMap r1 = r9.zzg
            r1.put(r3, r5)
            goto Le
        Lea:
            java.util.HashSet r1 = r9.zzf
            r1.add(r3)
            java.util.HashMap r1 = r9.zzg
            java.lang.String r2 = "noAdView"
            r1.put(r3, r2)
            goto Le
        Lf8:
            return
    }

    public final boolean zzj(android.view.View r3) {
            r2 = this;
            java.util.Map r0 = r2.zzh
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L11
            java.util.Map r0 = r2.zzh
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r3, r1)
            r3 = 0
            return r3
        L11:
            r3 = 1
            return r3
    }

    public final int zzk(android.view.View r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zzd
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            boolean r2 = r1.zzi
            if (r2 == 0) goto L10
            r2 = 2
            return r2
        L10:
            r2 = 3
            return r2
    }
}
