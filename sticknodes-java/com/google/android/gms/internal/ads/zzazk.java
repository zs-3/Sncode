package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzazk {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final com.google.android.gms.internal.ads.zzazz zze;
    private final com.google.android.gms.internal.ads.zzbah zzf;
    private final java.lang.Object zzg;
    private final java.util.ArrayList zzh;
    private final java.util.ArrayList zzi;
    private final java.util.ArrayList zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private java.lang.String zzo;
    private java.lang.String zzp;
    private java.lang.String zzq;

    public zzazk(int r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzg = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzh = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzi = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzj = r0
            r0 = 0
            r1.zzk = r0
            r1.zzl = r0
            r1.zzm = r0
            java.lang.String r0 = ""
            r1.zzo = r0
            r1.zzp = r0
            r1.zzq = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r9
            com.google.android.gms.internal.ads.zzazz r2 = new com.google.android.gms.internal.ads.zzazz
            r2.<init>(r5)
            r1.zze = r2
            com.google.android.gms.internal.ads.zzbah r2 = new com.google.android.gms.internal.ads.zzbah
            r2.<init>(r6, r7, r8)
            r1.zzf = r2
            return
    }

    private final void zzp(java.lang.String r8, boolean r9, float r10, float r11, float r12, float r13) {
            r7 = this;
            if (r8 == 0) goto L3f
            int r0 = r7.zzc
            int r1 = r8.length()
            if (r1 >= r0) goto Lb
            goto L3f
        Lb:
            java.lang.Object r0 = r7.zzg
            monitor-enter(r0)
            java.util.ArrayList r1 = r7.zzh     // Catch: java.lang.Throwable -> L3c
            r1.add(r8)     // Catch: java.lang.Throwable -> L3c
            int r1 = r7.zzk     // Catch: java.lang.Throwable -> L3c
            int r2 = r8.length()     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + r2
            r7.zzk = r1     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L3a
            java.util.ArrayList r9 = r7.zzi     // Catch: java.lang.Throwable -> L3c
            r9.add(r8)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r8 = r7.zzj     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzazv r9 = new com.google.android.gms.internal.ads.zzazv     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r1 = r7.zzi     // Catch: java.lang.Throwable -> L3c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L3c
            int r6 = r1 + (-1)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c
            r8.add(r9)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            return
    }

    private static final java.lang.String zzq(java.util.ArrayList r5, int r6) {
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L14:
            r3 = 100
            if (r2 >= r0) goto L2e
            java.lang.Object r4 = r5.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r6.append(r4)
            r4 = 32
            r6.append(r4)
            int r4 = r6.length()
            int r2 = r2 + 1
            if (r4 <= r3) goto L14
        L2e:
            int r5 = r6.length()
            int r5 = r5 + (-1)
            r6.deleteCharAt(r5)
            java.lang.String r5 = r6.toString()
            int r6 = r5.length()
            if (r6 >= r3) goto L42
            return r5
        L42:
            java.lang.String r5 = r5.substring(r1, r3)
            return r5
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzazk
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r3) goto La
            return r0
        La:
            com.google.android.gms.internal.ads.zzazk r4 = (com.google.android.gms.internal.ads.zzazk) r4
            java.lang.String r4 = r4.zzo
            if (r4 == 0) goto L19
            java.lang.String r2 = r3.zzo
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L19
            return r0
        L19:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zzo
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r10 = this;
            java.util.ArrayList r0 = r10.zzh
            int r1 = r10.zzl
            int r2 = r10.zzn
            int r3 = r10.zzk
            r4 = 100
            java.lang.String r0 = zzq(r0, r4)
            java.util.ArrayList r5 = r10.zzi
            java.lang.String r4 = zzq(r5, r4)
            java.lang.String r5 = r10.zzo
            java.lang.String r6 = r10.zzp
            java.lang.String r7 = r10.zzq
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ActivityContent fetchId: "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = " score:"
            r8.append(r1)
            r8.append(r2)
            java.lang.String r1 = " total_length:"
            r8.append(r1)
            r8.append(r3)
            java.lang.String r1 = "\n text: "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = "\n viewableText"
            r8.append(r0)
            r8.append(r4)
            java.lang.String r0 = "\n signture: "
            r8.append(r0)
            r8.append(r5)
            java.lang.String r0 = "\n viewableSignture: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = "\n viewableSignatureForVertical: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r0 = r8.toString()
            return r0
    }

    final int zza(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.zzd
            if (r0 == 0) goto L7
            int r2 = r1.zzb
            return r2
        L7:
            int r0 = r1.zza
            int r2 = r2 * r0
            int r0 = r1.zzb
            int r3 = r3 * r0
            int r2 = r2 + r3
            return r2
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzn
            return r0
    }

    final int zzc() {
            r1 = this;
            int r0 = r1.zzk
            return r0
    }

    public final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzo
            return r0
    }

    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzp
            return r0
    }

    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zzq
            return r0
    }

    public final void zzg() {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            int r1 = r2.zzm     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + (-1)
            r2.zzm = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final void zzh() {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            int r1 = r2.zzm     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + 1
            r2.zzm = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final void zzi() {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            int r1 = r2.zzn     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + (-100)
            r2.zzn = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final void zzj(int r1) {
            r0 = this;
            r0.zzl = r1
            return
    }

    public final void zzk(java.lang.String r1, boolean r2, float r3, float r4, float r5, float r6) {
            r0 = this;
            r0.zzp(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void zzl(java.lang.String r1, boolean r2, float r3, float r4, float r5, float r6) {
            r0 = this;
            r0.zzp(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = r0.zzg
            monitor-enter(r1)
            int r2 = r0.zzm     // Catch: java.lang.Throwable -> L14
            if (r2 >= 0) goto Lf
            java.lang.String r2 = "ActivityContent: negative number of WebViews."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)     // Catch: java.lang.Throwable -> L14
        Lf:
            r0.zzm()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public final void zzm() {
            r4 = this;
            java.lang.Object r0 = r4.zzg
            monitor-enter(r0)
            int r1 = r4.zzk     // Catch: java.lang.Throwable -> L4f
            int r2 = r4.zzl     // Catch: java.lang.Throwable -> L4f
            int r1 = r4.zza(r1, r2)     // Catch: java.lang.Throwable -> L4f
            int r2 = r4.zzn     // Catch: java.lang.Throwable -> L4f
            if (r1 <= r2) goto L4d
            r4.zzn = r1     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()     // Catch: java.lang.Throwable -> L4f
            boolean r1 = r1.zzP()     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.zzazz r1 = r4.zze     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r2 = r4.zzh     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r1.zza(r2)     // Catch: java.lang.Throwable -> L4f
            r4.zzo = r1     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzazz r1 = r4.zze     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r2 = r4.zzi     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r1.zza(r2)     // Catch: java.lang.Throwable -> L4f
            r4.zzp = r1     // Catch: java.lang.Throwable -> L4f
        L33:
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()     // Catch: java.lang.Throwable -> L4f
            boolean r1 = r1.zzQ()     // Catch: java.lang.Throwable -> L4f
            if (r1 != 0) goto L4d
            com.google.android.gms.internal.ads.zzbah r1 = r4.zzf     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r2 = r4.zzi     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r3 = r4.zzj     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r1.zza(r2, r3)     // Catch: java.lang.Throwable -> L4f
            r4.zzq = r1     // Catch: java.lang.Throwable -> L4f
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r1
    }

    public final void zzn() {
            r3 = this;
            java.lang.Object r0 = r3.zzg
            monitor-enter(r0)
            int r1 = r3.zzk     // Catch: java.lang.Throwable -> L13
            int r2 = r3.zzl     // Catch: java.lang.Throwable -> L13
            int r1 = r3.zza(r1, r2)     // Catch: java.lang.Throwable -> L13
            int r2 = r3.zzn     // Catch: java.lang.Throwable -> L13
            if (r1 <= r2) goto L11
            r3.zzn = r1     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public final boolean zzo() {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            int r1 = r2.zzm     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }
}
