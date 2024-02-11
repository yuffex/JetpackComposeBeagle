# Проект: BadgeBox в Jetpack Compose

![BadgeBox в Jetpack Compose](https://example.com/screensho1.png)

Этот проект представляет собой краткий туториал по созданию BadgeBox в Jetpack Compose. BadgeBox - это элемент пользовательского интерфейса, который обычно используется для показа уведомлений или счетчиков поверх других элементов.

## Как использовать

Для использования BadgeBox в Jetpack Compose, вам понадобится включить экспериментальные API `ExperimentalMaterial3Api`. Затем вы можете использовать функцию `GreetingBadge`, которая создает BadgedBox с иконкой и значком бейджа.

![BadgeBox в Jetpack Compose](https://example.com/screensho1.png)
```kotlin
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GreetingBadge() {
    BadgedBox( badge = { Badge { Text(text = "99+") }  }) {
        Icon(
            imageVector = Icons.Default.Email, contentDescription = "Email",
            modifier = Modifier.size(40.dp)
        )
    }
}
```
Чтобы предварительно просмотреть BadgeBox, вы можете использовать функцию BadgePreview.

```
![BadgeBox в Jetpack Compose](https://example.com/screensho1.png)
@Preview
@Composable
fun BadgePreview(){
   Surface(modifier = Modifier.fillMaxSize(),
       color = MaterialTheme.colorScheme.background) {
       Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
           GreetingBadge()
       }
   }
}
```
#Скопируйте код GreetingBadge и BadgePreview из этого репозитория в ваш проект
Используйте функцию GreetingBadge в своем пользовательском интерфейсе, как показано.
