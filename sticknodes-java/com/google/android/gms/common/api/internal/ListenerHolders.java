package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class ListenerHolders {
    private final java.util.Set zaa;

    public ListenerHolders() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.zaa = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L r1, android.os.Looper r2, java.lang.String r3) {
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Looper must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Listener type must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.common.api.internal.ListenerHolder r0 = new com.google.android.gms.common.api.internal.ListenerHolder
            r0.<init>(r2, r1, r3)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L r1, java.util.concurrent.Executor r2, java.lang.String r3) {
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Executor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Listener type must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            com.google.android.gms.common.api.internal.ListenerHolder r0 = new com.google.android.gms.common.api.internal.ListenerHolder
            r0.<init>(r2, r1, r3)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <L> com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> createListenerKey(L r1, java.lang.String r2) {
            java.lang.String r0 = "Listener must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "Listener type must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.String r0 = "Listener type must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey
            r0.<init>(r1, r2)
            return r0
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder zaa(java.lang.Object r2, android.os.Looper r3, java.lang.String r4) {
            r1 = this;
            java.util.Set r4 = r1.zaa
            java.lang.String r0 = "NO_TYPE"
            com.google.android.gms.common.api.internal.ListenerHolder r2 = createListenerHolder(r2, r3, r0)
            r4.add(r2)
            return r2
    }

    public final void zab() {
            r2 = this;
            java.util.Set r0 = r2.zaa
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.ListenerHolder r1 = (com.google.android.gms.common.api.internal.ListenerHolder) r1
            r1.clear()
            goto L6
        L16:
            java.util.Set r0 = r2.zaa
            r0.clear()
            return
    }
}
