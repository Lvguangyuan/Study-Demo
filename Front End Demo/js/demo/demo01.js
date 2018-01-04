var app01 = new Vue({
	el:'#app-01',
	data:{
		message:'Hello World!'
	}
})

var app02 = new Vue({
	el:'#app-02',
	data:{
		message:'page load at: '+new Date() 
	}
})

var app03 = new Vue({
	el:'#app-03',
	data:{
		seen:true
	}
})

var app04 = new Vue({
	el:'#app-04',
	data:{
		todos:[
			{text:'javaScript'},
			{text:'Vue'},
			{text:'perfect'}
		]
	}
})

var app05 = new Vue({
	el:'#app-05',
	data:{
		message: "ABCDEFG"
	},
	methods:{
		reverseMessage: function(){
			this.message = this.message.split('').reverse().join('') ;
		}
	}
})

var app06 = new Vue({
	el:'#app-06',
	data:{
		message:''
	}
})

Vue.component('todo-item',{
	props:['todo'],
	template:'<li>{{todo.text}}</li>'
})

var app07 = new Vue({
	el:'#app-07',
	data:{
		groceryList:[
			{text:'vegetable'},
			{text:'milk'},
			{text:'apple'}
		]
	}
})

var app0 = new Vue({
	el:'#app-0',
})

var app0 = new Vue({
	el:'#app-0',
})