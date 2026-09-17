package androidx.lifecycle;

/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public class ViewModelProvider {
    private final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras;
    private final androidx.lifecycle.ViewModelProvider.Factory factory;
    private final androidx.lifecycle.ViewModelStore store;

    /* compiled from: ViewModelProvider.kt */
    public static class AndroidViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> APPLICATION_KEY = null;
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion Companion = null;
        private static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory sInstance;
        private final android.app.Application application;

        /* compiled from: ViewModelProvider.kt */
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            private static final class ApplicationKeyImpl implements androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> {
                public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl INSTANCE = null;

                static {
                        androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl
                        r0.<init>()
                        androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.INSTANCE = r0
                        return
                }

                private ApplicationKeyImpl() {
                        r0 = this;
                        r0.<init>()
                        return
                }
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application r2) {
                    r1 = this;
                    java.lang.String r0 = "application"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$getSInstance$cp()
                    if (r0 != 0) goto L13
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
                    r0.<init>(r2)
                    androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$setSInstance$cp(r0)
                L13:
                    androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r2 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.access$getSInstance$cp()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                    return r2
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion = r0
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.INSTANCE
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY = r0
                return
        }

        public AndroidViewModelFactory() {
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r1)
                return
        }

        public AndroidViewModelFactory(android.app.Application r2) {
                r1 = this;
                java.lang.String r0 = "application"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        private AndroidViewModelFactory(android.app.Application r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.application = r1
                return
        }

        public static final /* synthetic */ androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory access$getSInstance$cp() {
                androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance
                return r0
        }

        public static final /* synthetic */ void access$setSInstance$cp(androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory r0) {
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance = r0
                return
        }

        private final <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r6, android.app.Application r7) {
                r5 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
                boolean r1 = r1.isAssignableFrom(r6)
                if (r1 == 0) goto L7e
                r1 = 1
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.InstantiationException -> L3c java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L68
                java.lang.Class<android.app.Application> r3 = android.app.Application.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.InstantiationException -> L3c java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L68
                java.lang.reflect.Constructor r2 = r6.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.InstantiationException -> L3c java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L68
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.InstantiationException -> L3c java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L68
                r1[r4] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.InstantiationException -> L3c java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L68
                java.lang.Object r7 = r2.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.InstantiationException -> L3c java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L68
                androidx.lifecycle.ViewModel r7 = (androidx.lifecycle.ViewModel) r7     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.InstantiationException -> L3c java.lang.IllegalAccessException -> L52 java.lang.NoSuchMethodException -> L68
                java.lang.String r6 = "{\n                try {\n…          }\n            }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
                goto L82
            L26:
                r7 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r7)
                throw r1
            L3c:
                r7 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r7)
                throw r1
            L52:
                r7 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r7)
                throw r1
            L68:
                r7 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r7)
                throw r1
            L7e:
                androidx.lifecycle.ViewModel r7 = super.create(r6)
            L82:
                return r7
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r2) {
                r1 = this;
                java.lang.String r0 = "modelClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                android.app.Application r0 = r1.application
                if (r0 == 0) goto Le
                androidx.lifecycle.ViewModel r2 = r1.create(r2, r0)
                return r2
            Le:
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras)."
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r2, androidx.lifecycle.viewmodel.CreationExtras r3) {
                r1 = this;
                java.lang.String r0 = "modelClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "extras"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.app.Application r0 = r1.application
                if (r0 == 0) goto L13
                androidx.lifecycle.ViewModel r2 = r1.create(r2)
                goto L2e
            L13:
                androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
                java.lang.Object r3 = r3.get(r0)
                android.app.Application r3 = (android.app.Application) r3
                if (r3 == 0) goto L22
                androidx.lifecycle.ViewModel r2 = r1.create(r2, r3)
                goto L2e
            L22:
                java.lang.Class<androidx.lifecycle.AndroidViewModel> r3 = androidx.lifecycle.AndroidViewModel.class
                boolean r3 = r3.isAssignableFrom(r2)
                if (r3 != 0) goto L2f
                androidx.lifecycle.ViewModel r2 = super.create(r2)
            L2e:
                return r2
            L2f:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "CreationExtras must have an application by `APPLICATION_KEY`"
                r2.<init>(r3)
                throw r2
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public interface Factory {
        public static final androidx.lifecycle.ViewModelProvider.Factory.Companion Companion = null;

        /* compiled from: ViewModelProvider.kt */
        /* renamed from: androidx.lifecycle.ViewModelProvider$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static androidx.lifecycle.ViewModel $default$create(androidx.lifecycle.ViewModelProvider.Factory r0, java.lang.Class r1) {
                    java.lang.String r0 = "modelClass"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."
                    r0.<init>(r1)
                    throw r0
            }

            public static androidx.lifecycle.ViewModel $default$create(androidx.lifecycle.ViewModelProvider.Factory r1, java.lang.Class r2, androidx.lifecycle.viewmodel.CreationExtras r3) {
                    java.lang.String r0 = "modelClass"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    java.lang.String r0 = "extras"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    androidx.lifecycle.ViewModel r1 = r1.create(r2)
                    return r1
            }

            static {
                    androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = androidx.lifecycle.ViewModelProvider.Factory.Companion
                    return
            }
        }

        /* compiled from: ViewModelProvider.kt */
        public static final class Companion {
            static final /* synthetic */ androidx.lifecycle.ViewModelProvider.Factory.Companion $$INSTANCE = null;

            static {
                    androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = new androidx.lifecycle.ViewModelProvider$Factory$Companion
                    r0.<init>()
                    androidx.lifecycle.ViewModelProvider.Factory.Companion.$$INSTANCE = r0
                    return
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$Factory$Companion r0 = androidx.lifecycle.ViewModelProvider.Factory.Companion.$$INSTANCE
                androidx.lifecycle.ViewModelProvider.Factory.Companion = r0
                return
        }

        <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r1);

        <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r1, androidx.lifecycle.viewmodel.CreationExtras r2);
    }

    /* compiled from: ViewModelProvider.kt */
    public static class NewInstanceFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion Companion = null;
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> VIEW_MODEL_KEY = null;
        private static androidx.lifecycle.ViewModelProvider.NewInstanceFactory sInstance;

        /* compiled from: ViewModelProvider.kt */
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            private static final class ViewModelKeyImpl implements androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> {
                public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl INSTANCE = null;

                static {
                        androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl
                        r0.<init>()
                        androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.INSTANCE = r0
                        return
                }

                private ViewModelKeyImpl() {
                        r0 = this;
                        r0.<init>()
                        return
                }
            }

            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
                    r1 = this;
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$getSInstance$cp()
                    if (r0 != 0) goto Le
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory
                    r0.<init>()
                    androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$setSInstance$cp(r0)
                Le:
                    androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.access$getSInstance$cp()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    return r0
            }
        }

        static {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r0 = new androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion = r0
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.INSTANCE
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY = r0
                return
        }

        public NewInstanceFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ androidx.lifecycle.ViewModelProvider.NewInstanceFactory access$getSInstance$cp() {
                androidx.lifecycle.ViewModelProvider$NewInstanceFactory r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance
                return r0
        }

        public static final /* synthetic */ void access$setSInstance$cp(androidx.lifecycle.ViewModelProvider.NewInstanceFactory r0) {
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance = r0
                return
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r5) {
                r4 = this;
                java.lang.String r0 = "Cannot create an instance of "
                java.lang.String r1 = "modelClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                java.lang.Object r1 = r5.newInstance()     // Catch: java.lang.IllegalAccessException -> L13 java.lang.InstantiationException -> L29
                java.lang.String r2 = "{\n                modelC…wInstance()\n            }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.InstantiationException -> L29
                androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1     // Catch: java.lang.IllegalAccessException -> L13 java.lang.InstantiationException -> L29
                return r1
            L13:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5, r1)
                throw r2
            L29:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r5)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5, r1)
                throw r2
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ androidx.lifecycle.ViewModel create(java.lang.Class r1, androidx.lifecycle.viewmodel.CreationExtras r2) {
                r0 = this;
                androidx.lifecycle.ViewModel r1 = androidx.lifecycle.ViewModelProvider.Factory.CC.$default$create(r0, r1, r2)
                return r1
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public static class OnRequeryFactory {
        public OnRequeryFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onRequery(androidx.lifecycle.ViewModel r2) {
                r1 = this;
                java.lang.String r0 = "viewModel"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStore r8, androidx.lifecycle.ViewModelProvider.Factory r9) {
            r7 = this;
            java.lang.String r0 = "store"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStore r2, androidx.lifecycle.ViewModelProvider.Factory r3, androidx.lifecycle.viewmodel.CreationExtras r4) {
            r1 = this;
            java.lang.String r0 = "store"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "defaultCreationExtras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.store = r2
            r1.factory = r3
            r1.defaultCreationExtras = r4
            return
    }

    public /* synthetic */ ViewModelProvider(androidx.lifecycle.ViewModelStore r1, androidx.lifecycle.ViewModelProvider.Factory r2, androidx.lifecycle.viewmodel.CreationExtras r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            androidx.lifecycle.viewmodel.CreationExtras$Empty r3 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r3, androidx.lifecycle.ViewModelProvider.Factory r4) {
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.lifecycle.viewmodel.CreationExtras r3 = androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(r3)
            r2.<init>(r0, r4, r3)
            return
    }

    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.Class<T> r4) {
            r3 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            androidx.lifecycle.ViewModel r4 = r3.get(r0, r4)
            return r4
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r4.<init>(r0)
            throw r4
    }

    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.String r3, java.lang.Class<T> r4) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r2.store
            androidx.lifecycle.ViewModel r0 = r0.get(r3)
            boolean r1 = r4.isInstance(r0)
            if (r1 == 0) goto L30
            androidx.lifecycle.ViewModelProvider$Factory r3 = r2.factory
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelProvider.OnRequeryFactory
            if (r4 == 0) goto L1f
            androidx.lifecycle.ViewModelProvider$OnRequeryFactory r3 = (androidx.lifecycle.ViewModelProvider.OnRequeryFactory) r3
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L2a
            java.lang.String r4 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r3.onRequery(r0)
        L2a:
            java.lang.String r3 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            java.util.Objects.requireNonNull(r0, r3)
            return r0
        L30:
            androidx.lifecycle.viewmodel.MutableCreationExtras r0 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            androidx.lifecycle.viewmodel.CreationExtras r1 = r2.defaultCreationExtras
            r0.<init>(r1)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r1 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            r0.set(r1, r3)
            androidx.lifecycle.ViewModelProvider$Factory r1 = r2.factory     // Catch: java.lang.AbstractMethodError -> L43
            androidx.lifecycle.ViewModel r4 = r1.create(r4, r0)     // Catch: java.lang.AbstractMethodError -> L43
            goto L49
        L43:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r2.factory
            androidx.lifecycle.ViewModel r4 = r0.create(r4)
        L49:
            androidx.lifecycle.ViewModelStore r0 = r2.store
            r0.put(r3, r4)
            return r4
    }
}
