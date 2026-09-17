package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
public final class zzab extends com.google.android.gms.auth.api.phone.SmsRetrieverClient {
    public zzab(android.app.Activity r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public zzab(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever() {
            r4 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.auth-api-phone.zzx r1 = new com.google.android.gms.internal.auth-api-phone.zzx
            r1.<init>(r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.run(r1)
            r1 = 1
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.p001authapiphone.zzac.zzc
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setFeatures(r1)
            r1 = 1567(0x61f, float:2.196E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = r0.setMethodKey(r1)
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.build()
            com.google.android.gms.tasks.Task r0 = r4.doWrite(r0)
            return r0
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsUserConsent(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r0 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.internal.auth-api-phone.zzy r1 = new com.google.android.gms.internal.auth-api-phone.zzy
            r1.<init>(r3, r4)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r4 = r0.run(r1)
            r0 = 1
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            com.google.android.gms.common.Feature r1 = com.google.android.gms.internal.p001authapiphone.zzac.zzd
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r4 = r4.setFeatures(r0)
            r0 = 1568(0x620, float:2.197E-42)
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r4 = r4.setMethodKey(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r4 = r4.build()
            com.google.android.gms.tasks.Task r4 = r3.doWrite(r4)
            return r4
    }
}
