package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zacd implements com.google.android.gms.tasks.OnCompleteListener {
    private final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final int zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;
    private final long zad;
    private final long zae;

    zacd(com.google.android.gms.common.api.internal.GoogleApiManager r1, int r2, com.google.android.gms.common.api.internal.ApiKey r3, long r4, long r6, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            r0.zae = r6
            return
    }

    static com.google.android.gms.common.api.internal.zacd zaa(com.google.android.gms.common.api.internal.GoogleApiManager r12, int r13, com.google.android.gms.common.api.internal.ApiKey r14) {
            boolean r0 = r12.zaD()
            if (r0 != 0) goto L7
            goto L49
        L7:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.getConfig()
            if (r0 == 0) goto L4b
            boolean r1 = r0.getMethodInvocationTelemetryEnabled()
            if (r1 == 0) goto L49
            boolean r0 = r0.getMethodTimingTelemetryEnabled()
            com.google.android.gms.common.api.internal.zabq r1 = r12.zai(r14)
            if (r1 == 0) goto L4c
            com.google.android.gms.common.api.Api$Client r2 = r1.zaf()
            boolean r2 = r2 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r2 == 0) goto L49
            com.google.android.gms.common.api.Api$Client r2 = r1.zaf()
            com.google.android.gms.common.internal.BaseGmsClient r2 = (com.google.android.gms.common.internal.BaseGmsClient) r2
            boolean r3 = r2.hasConnectionInfo()
            if (r3 == 0) goto L4c
            boolean r3 = r2.isConnecting()
            if (r3 != 0) goto L4c
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = zab(r1, r2, r13)
            if (r0 == 0) goto L49
            r1.zaq()
            boolean r0 = r0.getMethodTimingTelemetryEnabled()
            goto L4c
        L49:
            r12 = 0
            return r12
        L4b:
            r0 = 1
        L4c:
            com.google.android.gms.common.api.internal.zacd r11 = new com.google.android.gms.common.api.internal.zacd
            r1 = 0
            if (r0 == 0) goto L58
            long r3 = java.lang.System.currentTimeMillis()
            r5 = r3
            goto L59
        L58:
            r5 = r1
        L59:
            if (r0 == 0) goto L61
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7 = r0
            goto L62
        L61:
            r7 = r1
        L62:
            r9 = 0
            r10 = 0
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r7, r9, r10)
            return r11
    }

    private static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab(com.google.android.gms.common.api.internal.zabq r2, com.google.android.gms.common.internal.BaseGmsClient r3, int r4) {
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r3 = r3.getTelemetryConfiguration()
            r0 = 0
            if (r3 == 0) goto L33
            boolean r1 = r3.getMethodInvocationTelemetryEnabled()
            if (r1 == 0) goto L33
            int[] r1 = r3.getMethodInvocationMethodKeyAllowlist()
            if (r1 != 0) goto L21
            int[] r1 = r3.getMethodInvocationMethodKeyDisallowlist()
            if (r1 != 0) goto L1a
            goto L28
        L1a:
            boolean r4 = com.google.android.gms.common.util.ArrayUtils.contains(r1, r4)
            if (r4 == 0) goto L28
            goto L33
        L21:
            boolean r4 = com.google.android.gms.common.util.ArrayUtils.contains(r1, r4)
            if (r4 != 0) goto L28
            goto L33
        L28:
            int r2 = r2.zac()
            int r4 = r3.getMaxMethodInvocationsLogged()
            if (r2 >= r4) goto L33
            return r3
        L33:
            return r0
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task r23) {
            r22 = this;
            r0 = r22
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = r0.zaa
            boolean r1 = r1.zaD()
            if (r1 != 0) goto Lc
            goto Lf7
        Lc:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r1 = r1.getConfig()
            if (r1 == 0) goto L1c
            boolean r2 = r1.getMethodInvocationTelemetryEnabled()
            if (r2 == 0) goto Lf7
        L1c:
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r0.zaa
            com.google.android.gms.common.api.internal.ApiKey r3 = r0.zac
            com.google.android.gms.common.api.internal.zabq r2 = r2.zai(r3)
            if (r2 == 0) goto Lf7
            com.google.android.gms.common.api.Api$Client r3 = r2.zaf()
            boolean r3 = r3 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r3 == 0) goto Lf7
            com.google.android.gms.common.api.Api$Client r3 = r2.zaf()
            com.google.android.gms.common.internal.BaseGmsClient r3 = (com.google.android.gms.common.internal.BaseGmsClient) r3
            long r4 = r0.zad
            r6 = 1
            r7 = 0
            r9 = 0
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 <= 0) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = 0
        L41:
            int r20 = r3.getGCoreServiceId()
            r5 = 100
            if (r1 == 0) goto L84
            boolean r10 = r1.getMethodTimingTelemetryEnabled()
            r4 = r4 & r10
            int r10 = r1.getBatchPeriodMillis()
            int r11 = r1.getMaxMethodInvocationsInBatch()
            int r1 = r1.getVersion()
            boolean r12 = r3.hasConnectionInfo()
            if (r12 == 0) goto L81
            boolean r12 = r3.isConnecting()
            if (r12 != 0) goto L81
            int r4 = r0.zab
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = zab(r2, r3, r4)
            if (r2 == 0) goto Lf7
            boolean r3 = r2.getMethodTimingTelemetryEnabled()
            if (r3 == 0) goto L7b
            long r3 = r0.zad
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 <= 0) goto L7b
            goto L7c
        L7b:
            r6 = 0
        L7c:
            int r11 = r2.getMaxMethodInvocationsLogged()
            r4 = r6
        L81:
            r2 = r10
            r3 = r11
            goto L8b
        L84:
            r10 = 5000(0x1388, float:7.006E-42)
            r1 = 0
            r2 = 5000(0x1388, float:7.006E-42)
            r3 = 100
        L8b:
            com.google.android.gms.common.api.internal.GoogleApiManager r6 = r0.zaa
            boolean r10 = r23.isSuccessful()
            r11 = -1
            if (r10 == 0) goto L97
            r12 = 0
            r13 = 0
            goto Lc7
        L97:
            boolean r9 = r23.isCanceled()
            if (r9 == 0) goto La1
            r12 = 100
        L9f:
            r13 = -1
            goto Lc7
        La1:
            java.lang.Exception r5 = r23.getException()
            boolean r9 = r5 instanceof com.google.android.gms.common.api.ApiException
            if (r9 == 0) goto Lc2
            com.google.android.gms.common.api.ApiException r5 = (com.google.android.gms.common.api.ApiException) r5
            com.google.android.gms.common.api.Status r5 = r5.getStatus()
            int r9 = r5.getStatusCode()
            com.google.android.gms.common.ConnectionResult r5 = r5.getConnectionResult()
            if (r5 != 0) goto Lbb
            r12 = r9
            goto L9f
        Lbb:
            int r5 = r5.getErrorCode()
            r13 = r5
            r12 = r9
            goto Lc7
        Lc2:
            r9 = 101(0x65, float:1.42E-43)
            r12 = 101(0x65, float:1.42E-43)
            goto L9f
        Lc7:
            if (r4 == 0) goto Ldd
            long r7 = r0.zad
            long r4 = r0.zae
            long r9 = java.lang.System.currentTimeMillis()
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r14 = r14 - r4
            int r4 = (int) r14
            r21 = r4
            r14 = r7
            r16 = r9
            goto Le2
        Ldd:
            r14 = r7
            r16 = r14
            r21 = -1
        Le2:
            int r11 = r0.zab
            com.google.android.gms.common.internal.MethodInvocation r4 = new com.google.android.gms.common.internal.MethodInvocation
            r18 = 0
            r19 = 0
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r16, r18, r19, r20, r21)
            long r14 = (long) r2
            r11 = r6
            r12 = r4
            r13 = r1
            r16 = r3
            r11.zaw(r12, r13, r14, r16)
        Lf7:
            return
    }
}
