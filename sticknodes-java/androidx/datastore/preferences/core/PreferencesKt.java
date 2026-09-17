package androidx.datastore.preferences.core;

/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public final class PreferencesKt {

    /* compiled from: Preferences.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.Preferences, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(kotlin.jvm.functions.Function2<? super androidx.datastore.preferences.core.MutablePreferences, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.PreferencesKt.AnonymousClass2> r2) {
                r0 = this;
                r0.$transform = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                androidx.datastore.preferences.core.PreferencesKt$edit$2 r0 = new androidx.datastore.preferences.core.PreferencesKt$edit$2
                kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.$transform
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(androidx.datastore.preferences.core.Preferences r1, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.datastore.preferences.core.PreferencesKt$edit$2 r1 = (androidx.datastore.preferences.core.PreferencesKt.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(androidx.datastore.preferences.core.Preferences r1, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> r2) {
                r0 = this;
                androidx.datastore.preferences.core.Preferences r1 = (androidx.datastore.preferences.core.Preferences) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r3.L$0
                androidx.datastore.preferences.core.MutablePreferences r0 = (androidx.datastore.preferences.core.MutablePreferences) r0
                kotlin.ResultKt.throwOnFailure(r4)
                goto L34
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.L$0
                androidx.datastore.preferences.core.Preferences r4 = (androidx.datastore.preferences.core.Preferences) r4
                androidx.datastore.preferences.core.MutablePreferences r4 = r4.toMutablePreferences()
                kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r3.$transform
                r3.L$0 = r4
                r3.label = r2
                java.lang.Object r1 = r1.invoke(r4, r3)
                if (r1 != r0) goto L33
                return r0
            L33:
                r0 = r4
            L34:
                return r0
        }
    }

    public static final java.lang.Object edit(androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r2, kotlin.jvm.functions.Function2<? super androidx.datastore.preferences.core.MutablePreferences, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> r4) {
            androidx.datastore.preferences.core.PreferencesKt$edit$2 r0 = new androidx.datastore.preferences.core.PreferencesKt$edit$2
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.Object r2 = r2.updateData(r0, r4)
            return r2
    }
}
