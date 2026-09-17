package com.google.android.gms.common.internal;

import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public abstract class GmsClient<T extends android.os.IInterface> extends com.google.android.gms.common.internal.BaseGmsClient<T> implements com.google.android.gms.common.api.Api.Client, com.google.android.gms.common.internal.zaj {
    private static volatile java.util.concurrent.Executor zaa;
    private final com.google.android.gms.common.internal.ClientSettings zab;
    private final java.util.Set zac;
    private final android.accounts.Account zad;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected GmsClient(android.content.Context r9, android.os.Handler r10, int r11, com.google.android.gms.common.internal.ClientSettings r12) {
            r8 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r9)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.google.android.gms.common.internal.ClientSettings r9 = (com.google.android.gms.common.internal.ClientSettings) r9
            r8.zab = r9
            android.accounts.Account r9 = r12.getAccount()
            r8.zad = r9
            java.util.Set r9 = r12.getAllRequestedScopes()
            java.util.Set r9 = r8.zaa(r9)
            r8.zac = r9
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected GmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.ClientSettings r13) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            r7 = 0
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    protected GmsClient(android.content.Context r1, android.os.Looper r2, int r3, com.google.android.gms.common.internal.ClientSettings r4, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected GmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.ClientSettings r13, com.google.android.gms.common.api.internal.ConnectionCallbacks r14, com.google.android.gms.common.api.internal.OnConnectionFailedListener r15) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailability r4 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.ConnectionCallbacks r7 = (com.google.android.gms.common.api.internal.ConnectionCallbacks) r7
            java.lang.Object r14 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)
            r8 = r14
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r8 = (com.google.android.gms.common.api.internal.OnConnectionFailedListener) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    protected GmsClient(android.content.Context r11, android.os.Looper r12, com.google.android.gms.common.internal.GmsClientSupervisor r13, com.google.android.gms.common.GoogleApiAvailability r14, int r15, com.google.android.gms.common.internal.ClientSettings r16, com.google.android.gms.common.api.internal.ConnectionCallbacks r17, com.google.android.gms.common.api.internal.OnConnectionFailedListener r18) {
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto La
            r6 = r2
            goto L10
        La:
            com.google.android.gms.common.internal.zah r3 = new com.google.android.gms.common.internal.zah
            r3.<init>(r0)
            r6 = r3
        L10:
            if (r1 != 0) goto L14
            r7 = r2
            goto L1a
        L14:
            com.google.android.gms.common.internal.zai r0 = new com.google.android.gms.common.internal.zai
            r0.<init>(r1)
            r7 = r0
        L1a:
            java.lang.String r8 = r16.zac()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.zab = r0
            android.accounts.Account r1 = r16.getAccount()
            r9.zad = r1
            java.util.Set r0 = r16.getAllRequestedScopes()
            java.util.Set r0 = r10.zaa(r0)
            r9.zac = r0
            return
    }

    private final java.util.Set zaa(java.util.Set r4) {
            r3 = this;
            java.util.Set r0 = r3.validateScopes(r4)
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L1b
            goto L8
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expanding scopes is not permitted, use implied scopes instead"
            r4.<init>(r0)
            throw r4
        L23:
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.zad
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.util.concurrent.Executor getBindServiceExecutor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected final com.google.android.gms.common.internal.ClientSettings getClientSettings() {
            r1 = this;
            com.google.android.gms.common.internal.ClientSettings r0 = r1.zab
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r1 = this;
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @com.google.android.gms.common.annotation.KeepForSdk
    protected final java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
            r1 = this;
            java.util.Set r0 = r1.zac
            return r0
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
            r1 = this;
            boolean r0 = r1.requiresSignIn()
            if (r0 == 0) goto L9
            java.util.Set r0 = r1.zac
            goto Ld
        L9:
            java.util.Set r0 = java.util.Collections.emptySet()
        Ld:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.util.Set<com.google.android.gms.common.api.Scope> validateScopes(java.util.Set<com.google.android.gms.common.api.Scope> r1) {
            r0 = this;
            return r1
    }
}
