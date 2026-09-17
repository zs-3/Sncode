package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zacz extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zaa;

    public zacz(com.google.android.gms.common.api.internal.zada r1, android.os.Looper r2) {
            r0 = this;
            r0.zaa = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r5) {
            r4 = this;
            int r0 = r5.what
            if (r0 == 0) goto L36
            r1 = 1
            if (r0 == r1) goto L1e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "TransformationResultHandler received unknown message type: "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "TransformedResultImpl"
            android.util.Log.e(r0, r5)
            return
        L1e:
            java.lang.Object r5 = r5.obj
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            java.lang.String r0 = r5.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Runtime exception on the transformation worker thread: "
            java.lang.String r2 = "TransformedResultImpl"
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.e(r2, r0)
            throw r5
        L36:
            java.lang.Object r5 = r5.obj
            com.google.android.gms.common.api.PendingResult r5 = (com.google.android.gms.common.api.PendingResult) r5
            com.google.android.gms.common.api.internal.zada r0 = r4.zaa
            java.lang.Object r0 = com.google.android.gms.common.api.internal.zada.zad(r0)
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zada r1 = r4.zaa     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.common.api.internal.zada r1 = com.google.android.gms.common.api.internal.zada.zac(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.common.api.internal.zada r1 = (com.google.android.gms.common.api.internal.zada) r1     // Catch: java.lang.Throwable -> L6f
            if (r5 != 0) goto L5c
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> L6f
            r2 = 13
            java.lang.String r3 = "Transform returned null"
            r5.<init>(r2, r3)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.common.api.internal.zada.zag(r1, r5)     // Catch: java.lang.Throwable -> L6f
            goto L6d
        L5c:
            boolean r2 = r5 instanceof com.google.android.gms.common.api.internal.zacp     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L6a
            com.google.android.gms.common.api.internal.zacp r5 = (com.google.android.gms.common.api.internal.zacp) r5     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.common.api.Status r5 = r5.zaa()     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.common.api.internal.zada.zag(r1, r5)     // Catch: java.lang.Throwable -> L6f
            goto L6d
        L6a:
            r1.zai(r5)     // Catch: java.lang.Throwable -> L6f
        L6d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            return
        L6f:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            throw r5
    }
}
