package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zab implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final com.google.android.gms.common.images.zag zab;

    public zab(com.google.android.gms.common.images.ImageManager r1, com.google.android.gms.common.images.zag r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            java.lang.String r0 = "LoadImageRunnable must be executed on the main thread"
            com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zag(r0)
            com.google.android.gms.common.images.zag r1 = r8.zab
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.images.ImageManager$ImageReceiver r0 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) r0
            if (r0 == 0) goto L25
            com.google.android.gms.common.images.ImageManager r1 = r8.zaa
            com.google.android.gms.common.images.zag r2 = r8.zab
            java.util.Map r1 = com.google.android.gms.common.images.ImageManager.zag(r1)
            r1.remove(r2)
            com.google.android.gms.common.images.zag r1 = r8.zab
            r0.zac(r1)
        L25:
            com.google.android.gms.common.images.zag r0 = r8.zab
            com.google.android.gms.common.images.zad r1 = r0.zaa
            android.net.Uri r2 = r1.zaa
            r3 = 1
            if (r2 == 0) goto Lc9
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zaf(r0)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L67
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r0.longValue()
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L5c
            com.google.android.gms.common.images.zag r0 = r8.zab
            com.google.android.gms.common.images.ImageManager r1 = r8.zaa
            android.content.Context r2 = com.google.android.gms.common.images.ImageManager.zaa(r1)
            com.google.android.gms.internal.base.zam r1 = com.google.android.gms.common.images.ImageManager.zac(r1)
            r0.zab(r2, r1, r3)
            return
        L5c:
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            android.net.Uri r2 = r1.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zaf(r0)
            r0.remove(r2)
        L67:
            com.google.android.gms.common.images.zag r0 = r8.zab
            r2 = 0
            r4 = 0
            r0.zaa(r2, r4, r3, r4)
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            android.net.Uri r2 = r1.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zah(r0)
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.common.images.ImageManager$ImageReceiver r0 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) r0
            if (r0 != 0) goto L93
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            android.net.Uri r2 = r1.zaa
            com.google.android.gms.common.images.ImageManager$ImageReceiver r3 = new com.google.android.gms.common.images.ImageManager$ImageReceiver
            r3.<init>(r0, r2)
            com.google.android.gms.common.images.ImageManager r0 = r8.zaa
            android.net.Uri r2 = r1.zaa
            java.util.Map r0 = com.google.android.gms.common.images.ImageManager.zah(r0)
            r0.put(r2, r3)
            r0 = r3
        L93:
            com.google.android.gms.common.images.zag r2 = r8.zab
            r0.zab(r2)
            com.google.android.gms.common.images.zag r2 = r8.zab
            boolean r3 = r2 instanceof com.google.android.gms.common.images.zaf
            if (r3 != 0) goto La7
            com.google.android.gms.common.images.ImageManager r3 = r8.zaa
            java.util.Map r3 = com.google.android.gms.common.images.ImageManager.zag(r3)
            r3.put(r2, r0)
        La7:
            java.lang.Object r2 = com.google.android.gms.common.images.ImageManager.zad()
            monitor-enter(r2)
            java.util.HashSet r3 = com.google.android.gms.common.images.ImageManager.zae()     // Catch: java.lang.Throwable -> Lc6
            android.net.Uri r4 = r1.zaa     // Catch: java.lang.Throwable -> Lc6
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto Lc4
            java.util.HashSet r3 = com.google.android.gms.common.images.ImageManager.zae()     // Catch: java.lang.Throwable -> Lc6
            android.net.Uri r1 = r1.zaa     // Catch: java.lang.Throwable -> Lc6
            r3.add(r1)     // Catch: java.lang.Throwable -> Lc6
            r0.zad()     // Catch: java.lang.Throwable -> Lc6
        Lc4:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc6
            return
        Lc6:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc6
            throw r0
        Lc9:
            com.google.android.gms.common.images.ImageManager r1 = r8.zaa
            android.content.Context r2 = com.google.android.gms.common.images.ImageManager.zaa(r1)
            com.google.android.gms.internal.base.zam r1 = com.google.android.gms.common.images.ImageManager.zac(r1)
            r0.zab(r2, r1, r3)
            return
    }
}
