import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import confusion_matrix, accuracy_score
from sklearn.metrics import precision_score, recall_score

# 1. Load dataset
data = pd.read_csv("diabetes.csv")

print("Dataset Loaded Successfully")
print(data.head())

# 2. Handle missing values
data = data.fillna(data.median(numeric_only=True))

# 3. Separate features and target
X = data.drop("Outcome", axis=1)
Y = data["Outcome"]

# 4. Split dataset
X_train, X_test, Y_train, Y_test = train_test_split(
    X, Y, test_size=0.2, random_state=42
)

# 5. Normalize the data
scaler = StandardScaler()
X_train = scaler.fit_transform(X_train)
X_test = scaler.transform(X_test)

# 6. Create KNN model
model = KNeighborsClassifier(n_neighbors=5)

# 7. Train the model
model.fit(X_train, Y_train)

# 8. Predict the output
Y_pred = model.predict(X_test)

# 9. Calculate evaluation metrics
cm = confusion_matrix(Y_test, Y_pred)
accuracy = accuracy_score(Y_test, Y_pred)
error_rate = 1 - accuracy
precision = precision_score(Y_test, Y_pred, zero_division=0)
recall = recall_score(Y_test, Y_pred, zero_division=0)

# 10. Display results
print("\nConfusion Matrix:")
print(cm)

print("Accuracy:", accuracy)
print("Error Rate:", error_rate)
print("Precision:", precision)
print("Recall:", recall)
